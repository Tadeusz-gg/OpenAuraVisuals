package dev.aurap.hub;

import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.stream.Stream;

public final class dq implements Co {
    private static final long iw = 6000L;
    private static final String Aw = "smtc:";
    public static final String SCRIPT = "# Aura Visuals: reads the Windows media session for the Dynamic Island (what plays, cover, position)\n# and runs play/pause, next, previous and seek. Started by the game, ends when the game closes.\nparam([switch]$AnyPlayer)\n$ErrorActionPreference = 'Stop'\n[Console]::OutputEncoding = New-Object System.Text.UTF8Encoding($false)\nAdd-Type -AssemblyName System.Runtime.WindowsRuntime\n$asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object {\n  $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1' })[0]\nfunction Await($op, [Type]$type) {\n  $task = $asTaskGeneric.MakeGenericMethod($type).Invoke($null, @($op))\n  if (-not $task.Wait(4000)) { throw 'timeout' }\n  $task.Result\n}\n$null = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager, Windows.Media.Control, ContentType = WindowsRuntime]\n$null = [Windows.Storage.Streams.DataReader, Windows.Storage.Streams, ContentType = WindowsRuntime]\n$null = [Windows.Storage.Streams.IRandomAccessStreamWithContentType, Windows.Storage.Streams, ContentType = WindowsRuntime]\n$mgr = Await ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager]::RequestAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager])\n$stdin = New-Object System.IO.StreamReader([Console]::OpenStandardInput(), (New-Object System.Text.UTF8Encoding($false)))\n$pending = $stdin.ReadLineAsync()\n$lastKey = ''\nfunction Pick {\n  foreach ($s in $mgr.GetSessions()) { if ($s.SourceAppUserModelId -like '*Spotify*') { return $s } }\n  if ($AnyPlayer) { return $mgr.GetCurrentSession() }\n  return $null\n}\nwhile ($true) {\n  $session = $null\n  try { $session = Pick } catch { }\n  $o = @{ s = 'none' }\n  if ($session -ne $null) {\n    try {\n      $p = Await ($session.TryGetMediaPropertiesAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties])\n      $tl = $session.GetTimelineProperties()\n      $info = $session.GetPlaybackInfo()\n      $o = @{ s = [string]$info.PlaybackStatus; app = [string]$session.SourceAppUserModelId\n              title = [string]$p.Title; artist = [string]$p.Artist; album = [string]$p.AlbumTitle\n              duration = [long]($tl.EndTime - $tl.StartTime).TotalMilliseconds\n              position = [long]($tl.Position - $tl.StartTime).TotalMilliseconds\n              updated = [long]$tl.LastUpdatedTime.ToUnixTimeMilliseconds()\n              now = [long][DateTimeOffset]::UtcNow.ToUnixTimeMilliseconds()\n              seek = [bool]$info.Controls.IsPlaybackPositionEnabled }\n      $key = \"$($p.Title)|$($p.Artist)|$($p.AlbumTitle)\"\n      if ($key -ne $lastKey) {\n        $lastKey = $key\n        if ($p.Thumbnail -ne $null) {\n          try {\n            $stream = Await ($p.Thumbnail.OpenReadAsync()) ([Windows.Storage.Streams.IRandomAccessStreamWithContentType])\n            $size = [uint32]$stream.Size\n            if ($size -gt 0 -and $size -lt 4194304) {\n              $reader = New-Object Windows.Storage.Streams.DataReader($stream.GetInputStreamAt(0))\n              $null = Await ($reader.LoadAsync($size)) ([uint32])\n              $bytes = New-Object byte[] $size\n              $reader.ReadBytes($bytes)\n              $o.art = [Convert]::ToBase64String($bytes)\n              $reader.Dispose()\n            }\n            $stream.Dispose()\n          } catch { }\n        }\n      }\n    } catch { $o = @{ s = 'error'; msg = [string]$_.Exception.Message } }\n  }\n  [Console]::Out.WriteLine(($o | ConvertTo-Json -Compress))\n  [Console]::Out.Flush()\n  for ($i = 0; $i -lt 8; $i++) {\n    if ($pending.IsCompleted) {\n      $cmd = $pending.Result\n      if ($cmd -eq $null) { exit 0 }\n      $target = $null\n      try { $target = Pick } catch { }\n      if ($target -ne $null) {\n        try {\n          if ($cmd -eq 'toggle') { $null = Await ($target.TryTogglePlayPauseAsync()) ([bool]) }\n          elseif ($cmd -eq 'next') { $null = Await ($target.TrySkipNextAsync()) ([bool]) }\n          elseif ($cmd -eq 'previous') { $null = Await ($target.TrySkipPreviousAsync()) ([bool]) }\n          elseif ($cmd.StartsWith('seek ')) { $null = Await ($target.TryChangePlaybackPositionAsync([long]$cmd.Substring(5) * 10000)) ([bool]) }\n        } catch { }\n      }\n      $pending = $stdin.ReadLineAsync()\n      break\n    }\n    Start-Sleep -Milliseconds 50\n  }\n}\n";
    private final LongSupplier V;
    private final Path oz;
    private final qg W;
    private final Object ZZ;
    private AC AS;
    private String LC;
    private byte[] C;
    public static final int tr;

    public dq(boolean var1, Path var2, LongSupplier var3) {

        this.ZZ = new Object();
        this.LC = "";
        this.V = var3;
        Path var4_path = var2.resolve("media-session.ps1");
        this.oz = var4_path;
        String var5 = pk(-1230073408);
        Path var6 = this.oz;
        String var12 = var6.toString();
        List var9 = List.of(var5, "-NoLogo", "-NoProfile", "-NonInteractive", "-ExecutionPolicy", "Bypass", "-File", var12);
        List<String> var4 = new ArrayList<>(var9);
        if (var1) {
            boolean var10 = var4.add("-AnyPlayer");
        }

        Consumer<String> var13 = this::XG;
        qg var11 = new qg(var4, var13, var3);
        this.W = var11;
    }

    private static String pk(int var0) {
        String var2 = System.getenv("SystemRoot");
        int var1 = var0 ^ -1417142304;
        var1 >>>= 18;
        var1 ^= -1872508817;
        Integer var3 = var1;
        label34:
        if (var3 != null) {
            if (var2 != null) {
                var1 |= 1257616618;
                var1 ^= -1900914905;
                String[] var29 = new String[]{"System32", "WindowsPowerShell", "v1.0", "powershell.exe"};
                Path var28 = Path.of(var2, var29);
                LinkOption[] var30 = new LinkOption[0];
                var1 ^= 715274973;
                var1 |= -654652517;
                var1 -= 893196121;
                var1 ^= -1053686056;
                int var4 = var1 + 1;
                var4 = var1 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label34;
                }

                boolean var31 = Files.isRegularFile(var28, var30);
                if (var31) {
                    var1 *= 756653473;
                    var1 >>>= 19;
                    var1 -= 353987818;
                    var1 |= 180935730;
                    var1 ^= 438108330;
                    int var32 = var1 + 1;
                    var32 = var1 * var32;
                    var4 = var1 + 2;
                    var32 *= var4;
                    var4 = var1 + 3;
                    var32 *= var4;
                    var32 &= 7;
                    if (var32 == 0) {
                        return var28.toString();
                    }
                    break label34;
                }

                var1 += 2103517105;
                var1 += 135099931;
                var1 ^= -523999458;
            } else {
                var1 ^= -1345384966;
                var1 *= 1179236325;
                var1 |= 372342132;
                var1 ^= 1361756296;
            }

            long var24 = var1;
            long var37 = var24 + 1L;
            long var38 = var24 * var37;
            long var25 = var38 & 1L;
            long var43;
            var1 = (var43 = var25 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
            if (var1 == 0) {
                return "powershell.exe";
            }
        }

        UnsupportedOperationException var27 = new UnsupportedOperationException();
        throw var27;
    }

    private void HD(int var1) throws IOException {
        int var3 = System.identityHashCode(this);
        Charset var4 = StandardCharsets.UTF_8;
        byte[] var59 = "# Aura Visuals: reads the Windows media session for the Dynamic Island (what plays, cover, position)\n# and runs play/pause, next, previous and seek. Started by the game, ends when the game closes.\nparam([switch]$AnyPlayer)\n$ErrorActionPreference = 'Stop'\n[Console]::OutputEncoding = New-Object System.Text.UTF8Encoding($false)\nAdd-Type -AssemblyName System.Runtime.WindowsRuntime\n$asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object {\n  $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1' })[0]\nfunction Await($op, [Type]$type) {\n  $task = $asTaskGeneric.MakeGenericMethod($type).Invoke($null, @($op))\n  if (-not $task.Wait(4000)) { throw 'timeout' }\n  $task.Result\n}\n$null = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager, Windows.Media.Control, ContentType = WindowsRuntime]\n$null = [Windows.Storage.Streams.DataReader, Windows.Storage.Streams, ContentType = WindowsRuntime]\n$null = [Windows.Storage.Streams.IRandomAccessStreamWithContentType, Windows.Storage.Streams, ContentType = WindowsRuntime]\n$mgr = Await ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager]::RequestAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager])\n$stdin = New-Object System.IO.StreamReader([Console]::OpenStandardInput(), (New-Object System.Text.UTF8Encoding($false)))\n$pending = $stdin.ReadLineAsync()\n$lastKey = ''\nfunction Pick {\n  foreach ($s in $mgr.GetSessions()) { if ($s.SourceAppUserModelId -like '*Spotify*') { return $s } }\n  if ($AnyPlayer) { return $mgr.GetCurrentSession() }\n  return $null\n}\nwhile ($true) {\n  $session = $null\n  try { $session = Pick } catch { }\n  $o = @{ s = 'none' }\n  if ($session -ne $null) {\n    try {\n      $p = Await ($session.TryGetMediaPropertiesAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties])\n      $tl = $session.GetTimelineProperties()\n      $info = $session.GetPlaybackInfo()\n      $o = @{ s = [string]$info.PlaybackStatus; app = [string]$session.SourceAppUserModelId\n              title = [string]$p.Title; artist = [string]$p.Artist; album = [string]$p.AlbumTitle\n              duration = [long]($tl.EndTime - $tl.StartTime).TotalMilliseconds\n              position = [long]($tl.Position - $tl.StartTime).TotalMilliseconds\n              updated = [long]$tl.LastUpdatedTime.ToUnixTimeMilliseconds()\n              now = [long][DateTimeOffset]::UtcNow.ToUnixTimeMilliseconds()\n              seek = [bool]$info.Controls.IsPlaybackPositionEnabled }\n      $key = \"$($p.Title)|$($p.Artist)|$($p.AlbumTitle)\"\n      if ($key -ne $lastKey) {\n        $lastKey = $key\n        if ($p.Thumbnail -ne $null) {\n          try {\n            $stream = Await ($p.Thumbnail.OpenReadAsync()) ([Windows.Storage.Streams.IRandomAccessStreamWithContentType])\n            $size = [uint32]$stream.Size\n            if ($size -gt 0 -and $size -lt 4194304) {\n              $reader = New-Object Windows.Storage.Streams.DataReader($stream.GetInputStreamAt(0))\n              $null = Await ($reader.LoadAsync($size)) ([uint32])\n              $bytes = New-Object byte[] $size\n              $reader.ReadBytes($bytes)\n              $o.art = [Convert]::ToBase64String($bytes)\n              $reader.Dispose()\n            }\n            $stream.Dispose()\n          } catch { }\n        }\n      }\n    } catch { $o = @{ s = 'error'; msg = [string]$_.Exception.Message } }\n  }\n  [Console]::Out.WriteLine(($o | ConvertTo-Json -Compress))\n  [Console]::Out.Flush()\n  for ($i = 0; $i -lt 8; $i++) {\n    if ($pending.IsCompleted) {\n      $cmd = $pending.Result\n      if ($cmd -eq $null) { exit 0 }\n      $target = $null\n      try { $target = Pick } catch { }\n      if ($target -ne $null) {\n        try {\n          if ($cmd -eq 'toggle') { $null = Await ($target.TryTogglePlayPauseAsync()) ([bool]) }\n          elseif ($cmd -eq 'next') { $null = Await ($target.TrySkipNextAsync()) ([bool]) }\n          elseif ($cmd -eq 'previous') { $null = Await ($target.TrySkipPreviousAsync()) ([bool]) }\n          elseif ($cmd.StartsWith('seek ')) { $null = Await ($target.TryChangePlaybackPositionAsync([long]$cmd.Substring(5) * 10000)) ([bool]) }\n        } catch { }\n      }\n      $pending = $stdin.ReadLineAsync()\n      break\n    }\n    Start-Sleep -Milliseconds 50\n  }\n}\n"
            .getBytes(var4);
        int var5 = var59.length;
        var5 += 3;
        byte[] var74 = new byte[var5];
        var74[0] = -17;
        var74[1] = -69;
        int var6 = var3 + 1;
        var6 = var3 * var6;
        var6 &= 1;
        label66:
        if (var6 == 0) {
            int var14 = var1 | -63744787;
            var14 &= 1677344801;
            var14 ^= -1987620411;
            var74[2] = -65;
            var6 = var59.length;
            System.arraycopy(var59, 0, var74, 3, var6);
            Path var60 = this.oz;
            LinkOption[] var79 = new LinkOption[0];
            boolean var61 = Files.isRegularFile(var60, var79);
            if (var61) {
                var14 -= -1977227709;
                var14 ^= -1736643228;
                Path var62 = this.oz;
                var6 = var3 + 1;
                var6 = var3 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    var14 -= -344616201;
                    var14 -= -210462591;
                    var14 += 42661507;
                    var14 |= -54007051;
                    var14 ^= -159193957;
                    break label66;
                }

                var14 -= 1488500692;
                var14 &= 962568225;
                var14 *= 241726233;
                var14 -= -2024288914;
                var14 ^= -575988410;
                byte[] var63 = Files.readAllBytes(var62);
                boolean var64 = Arrays.equals(var63, var74);
                if (var64) {
                    switch (var14) {
                        case -2086070899:
                            var14 |= -1121454656;
                            var14 ^= 259392749;
                            break;
                        case -719583173:
                        default:
                            var14 ^= 1514285063;
                            break;
                        case 2146247711:
                            var14 ^= -2143686271;
                    }

                    return;
                }

                switch (var14) {
                    case -2086070899:
                        var14 <<= 27;
                        var14 -= -1536591580;
                        var14 += -1216381944;
                        var14 &= -2035356307;
                        var14 ^= 113143203;
                        break;
                    case -1732294218:
                    default:
                        var14 ^= -939630208;
                        break;
                    case 1698840531:
                        var14 ^= -900324553;
                }
            } else {
                switch (var14) {
                    case -1800381716:
                        var14 ^= 1630199932;
                        break;
                    case -344649244:
                        var14 |= 1588498297;
                        var14 -= 2010586278;
                        var14 ^= -200944247;
                        var14 ^= 2023045913;
                        break;
                    case 241337807:
                    default:
                        var14 ^= 205904249;
                }
            }

            Integer var65 = var14;
            if (var65 != null) {
                Path var66 = this.oz;
                Path var67 = var66.getParent();
                FileAttribute[] var83 = new FileAttribute[0];
                Path var68 = Files.createDirectories(var67, var83);
                Path var69 = this.oz;
                Path var84 = this.oz;
                Path var85 = var84.getFileName();
                long var7 = var3;
                long var9 = var7 + 1L;
                var9 = var7 * var9;
                var7 = var9 & 1L;
                long var90;
                var3 = (var90 = var7 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                if (var3 != 0) {
                    switch (var14) {
                        case -455069573:
                        default:
                            var14 ^= -441352146;
                            break label66;
                        case 79195591:
                            var14 += -768082072;
                            var14 ^= -303944285;
                            var14 ^= -1941711500;
                            var14 ^= -1123775850;
                            break label66;
                        case 675443595:
                            var14 ^= -1617261390;
                            break label66;
                    }
                }
                var14 = switch (var14) {
                    default -> var14 ^ 252229610;
                    case -323409548 -> var14 ^ -225457183;
                    case 79195591 -> {
                        var14 |= 1372363499;
                        yield var14 ^ -1847270690;
                    }
                };
                var3 = var14 + 1;
                var3 = var14 * var3;
                var3 &= 1;
                if (var3 == 0) {
                    String var55 = String.valueOf(var85);
                    String var56 = var55 + ".tmp";
                    Path var57 = var69.resolveSibling(var56);
                    OpenOption[] var70 = new OpenOption[0];
                    Path var71 = Files.write(var57, var74, var70);
                    Path var72 = this.oz;
                    CopyOption[] var75 = new CopyOption[2];
                    StandardCopyOption var86 = StandardCopyOption.REPLACE_EXISTING;
                    var75[0] = var86;
                    StandardCopyOption var87 = StandardCopyOption.ATOMIC_MOVE;
                    var75[1] = var87;
                    Path var58 = Files.move(var57, var72, var75);
                    return;
                }
            }

            UnsupportedOperationException var54 = new UnsupportedOperationException();
            throw var54;
        } else {
            int var2 = var1 ^ 2138686676;
            var2 <<= 6;
            var2 -= 1499123289;
            var2 ^= 117746889;
        }

        RuntimeException var49 = new RuntimeException();
        throw var49;
    }

    @Override
    public String name() {
        int var1 = System.identityHashCode(this);
        return "Spotify";
    }

    @Override
    public gM_2 timing() {
        int var1 = tr;
        var1 ^= -1160646046;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            var1 -= -976913704;
            var1 -= -1988357012;
            var1 |= 1018517476;
            var1 ^= -222886642;
            return new gM_2(250L, 250L, 500L, 15000L);
        } else {
            switch (var1) {
                case -996370292:
                default:
                    var1 ^= -1400972324;
                    break;
                case -413249785:
                    var1 ^= 1795247978;
                    break;
                case 1153124124:
                    var1 &= 414349668;
                    var1 &= -1158059395;
                    var1 ^= 199859998;
            }

            UnsupportedOperationException var9 = new UnsupportedOperationException();
            throw var9;
        }
    }
    @Override
public FX poll() throws IOException {
    if (!this.W.ensureRunning()) {
        return null;
    }
    if (this.AS != null && this.AS.failure() != null) {
        throw this.AS.failure();
    }
    return this.AS != null ? this.AS.track() : null;
}


    @Override
    public void send(Ar var1) throws IOException {
        String var67 = null;
        int var2 = tr;
        var2 ^= -693243415;
        int var3 = System.identityHashCode(this);
        qg var4 = this.W;
        int[] var5 = tX.v;
        Gu var6 = var1.kind();
        int var78 = var6.ordinal();
        Integer var7 = var3;
        if (var7 == null) {
            var2 ^= -547824032;
            var2 ^= -1519577910;
        } else {
            label80: {
                var2 >>= 9;
                var2 &= -1312568495;
                var2 |= -596472830;
                var2 ^= -1860054728;
                var2 ^= -1146374838;
                var7 = var2;
                label69:
                if (var7 != null) {
                    int var69 = var5[var78];
                    label67:
                    switch (var69) {
                        case 1:
                            var2 |= -494629168;
                            var2 *= 1397189297;
                            var2 ^= 972652769;
                            long var75 = var2;
                            long var86 = var75 + 1L;
                            long var87 = var75 * var86;
                            long var76 = var87 & 1L;
                            long var94;
                            int var77 = (var94 = var76 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
                            if (var77 != 0) {
                                break label69;
                            }

                            var67 = "toggle";
                            var2 &= -1961416912;
                            var2 ^= 693893414;
                            break;
                        case 2:
                            var2 = switch (var2) {
                                case -457264030 -> var2 ^ 547718152;
                                case -151475344 -> {
                                    var2 *= -1642495575;
                                    var2 *= 606944255;
                                    yield var2 ^ -1586086775;
                                }
                                default -> var2 ^ -864486749;
                            };
                            var67 = "next";
                            var2 &= 564424168;
                            var2 <<= 31;
                            var2 ^= 559807798;
                            break;
                        case 3:
                            var2 *= 1574228463;
                            var2 ^= -2069651446;
                            var2 ^= -2106885567;
                            var67 = "previous";
                            switch (var2) {
                                case -2094723040:
                                    var2 ^= 1403110585;
                                    break label67;
                                case -577533461:
                                default:
                                    var2 ^= 1237192044;
                                    break label67;
                                case 941008859:
                                    var2 |= -49944546;
                                    var2 += 1585176883;
                                    var2 ^= 2060332068;
                                    break label67;
                            }
                        case 4:
                            var2 |= -1291250151;
                            var2 ^= -1434617;
                            var67 = "seek 0";
                            switch (var2) {
                                case -1976124155:
                                default:
                                    var2 ^= 1974180841;
                                    break label67;
                                case -565470204:
                                    var2 ^= -1970672270;
                                    break label67;
                                case 135504766:
                                    var2 *= -1272645273;
                                    var2 |= 1297290797;
                                    var2 ^= 1458188045;
                                    var2 <<= 14;
                                    var2 ^= 2138144054;
                                    break label67;
                            }
                        case 5:
                            var2 += -2145784216;
                            var2 ^= -483918786;
                            long var70 = var2;
                            long var84 = var70 + 1L;
                            long var85 = var70 * var84;
                            long var71 = var85 & 1L;
                            long var91;
                            int var72 = (var91 = var71 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                            if (var72 != 0) {
                                break label69;
                            }

                            long var73 = var1.argument();
                            String var74 = "seek " + var73;
                            long var79 = var3;
                            long var8 = var79 + 1L;
                            var8 = var79 * var8;
                            long var80 = var8 & 1L;
                            long var92;
                            var3 = (var92 = var80 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                            if (var3 != 0) {
                                switch (var2) {
                                    case -1808439834:
                                        var2 &= 1638862279;
                                        var2 ^= 1389857787;
                                        break label80;
                                    case -1541853181:
                                    default:
                                        var2 ^= -1593153609;
                                        break label80;
                                    case -794205275:
                                        var2 ^= -1818864991;
                                        break label80;
                                }
                            }

                            var2 *= 1109614007;
                            var2 -= -278680320;
                            var2 *= -1368622633;
                            var2 ^= 1453794959;
                            long var81 = var2;
                            var8 = var81 + 1L;
                            var8 = var81 * var8;
                            long var82 = var8 & 1L;
                            long var93;
                            var3 = (var93 = var82 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                            if (var3 != 0) {
                                break label69;
                            }

                            var67 = var74;
                            var2 &= 226107354;
                            var2 ^= 544596158;
                            break;
                        default:
                            var2 *= -241020547;
                            var2 += 1937842787;
                            var2 <<= 16;
                            var2 |= -1114399098;
                            var2 ^= -450065748;
                            MatchException var64 = new MatchException(null, null);
                            throw var64;
                    }

                    var4.writeLine(var67);
                    return;
                }

                IllegalArgumentException var68 = new IllegalArgumentException();
                throw var68;
            }
        }

        AssertionError var63 = new AssertionError();
        throw var63;
    }
    @Override
public byte[] artwork(String uri) {
    if (this.AS != null && this.AS.art() != null) {
        return this.AS.art();
    }
    if (uri != null && !uri.isEmpty()) {
        try {
            return java.util.Base64.getDecoder().decode(uri);
        } catch (Exception ignored) {}
    }
    return null;
}


    @Override
    public void close() {
        int var1 = tr;
        var1 ^= 1081310255;
        Object var2 = null;
        qg var3 = this.W;
        var3.close();
        Throwable var67 = null;

        var1 = switch (var1) {
            case -1358031837 -> var1 ^ -399949738;
            case -1105606319 -> {
                var1 ^= 1061167954;
                var1 >>>= 7;
                var1 >>>= 13;
                var1 -= 2126660070;
                yield var1 ^ 1859385188;
            }
            default -> var1 ^ -1031350412;
        };
        Integer var4 = var1;
        if (var4 != null) {

            synchronized (this.ZZ){}
            var1 &= -1759127556;
            var1 -= -1194713318;
            var1 ^= -212039751;
            var1 ^= -1411491452;

            var1 = switch (var1) {
                case -1764021229 -> {
                    var1 += 702288958;
                    yield var1 ^ -2101971031;
                }
                case 233446017 -> var1 ^ 2042995750;
                default -> var1 ^ -856499541;
            };
            Integer var67_i = var1;
            label78:
            if (var67_i != null) {
                label76: {
                    label96: {
                        try {
                            this.AS = null;
                        } catch (Throwable var12) {
                            int var25 = tr;
                            int var26 = var25 ^ -998530568;
                            var67 = var12;
                            int var27 = var26 & -832988431;
                            int var28 = var27 + 1763305938;
                            int var29 = var28 * 288243865;
                            int var30 = var29 - -1607604533;
                            var1 = var30 ^ 2059591414;
                            int var5 = var1 + 1;
                            var5 = var1 * var5;
                            int var6 = var1 + 2;
                            var5 *= var6;
                            var6 = var1 + 3;
                            var5 *= var6;
                            var5 &= 7;
                            if (var5 != 0) {
                                break label78;
                            }
                            break label96;
                        }
                        var1 = switch (var1) {
                            case -363179532 -> var1 ^ 1827239838;
                            default -> var1 ^ -1884049564;
                            case 1107376120 -> {
                                var1 >>>= 29;
                                yield var1 ^ 1587204877;
                            }
                        };
                        long var80 = var1;
                        long var7 = var80 + 1L;
                        var7 = var80 * var7;
                        var80 = var7 & 1L;
                        long var102;
                        int var70 = (var102 = var80 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                        if (var70 != 0) {
                            break label78;
                        }

                        try {
                            var1 *= -1795117161;
                            var1 *= -976130157;
                            var1 ^= 587659798;
                            break label76;
                        } catch (Throwable var11) {
                            int var34 = tr;
                            int var35 = var34 ^ -998530568;
                            var67 = var11;
                            int var36 = var35 & -832988431;
                            int var37 = var36 + 1763305938;
                            int var38 = var37 * 288243865;
                            int var39 = var38 - -1607604533;
                            var1 = var39 ^ 2059591414;
                            int var82 = var1 + 1;
                            int var83 = var1 * var82;
                            int var93 = var1 + 2;
                            int var84 = var83 * var93;
                            var93 = var1 + 3;
                            int var85 = var84 * var93;
                            int var86 = var85 & 7;
                            if (var86 != 0) {
                                break label78;
                            }
                        }
                    }

                    while (true) {
                        try {
                        } catch (Throwable var10) {
                            int var40 = tr;
                            int var41 = var40 ^ -998530568;
                            var67 = var10;
                            int var42 = var41 & -832988431;
                            int var43 = var42 + 1763305938;
                            int var44 = var43 * 288243865;
                            int var45 = var44 - -1607604533;
                            var1 = var45 ^ 2059591414;
                            int var87 = var1 + 1;
                            var87 = var1 * var87;
                            int var95 = var1 + 2;
                            var87 *= var95;
                            var95 = var1 + 3;
                            var87 *= var95;
                            var87 &= 7;
                            if (var87 != 0) {
                                break label78;
                            }
                            continue;
                        }
                        long var73 = switch (var1) {
                            case 120253229 -> var1 ^ 153253933;
                            case 621865665 -> {
                                var1 |= -449168584;
                                var1 &= 1503159814;
                                var1 >>= 6;
                                yield var1 ^ -1408108226;
                            }
                            default -> var1 ^ 442970300;
                        };
                        long var97 = var73 + 1L;
                        var97 = var73 * var97;
                        long var8 = var73 + 2L;
                        var97 *= var8;
                        long var74 = var73 + 3L;
                        var97 *= var74;
                        long var75 = var97 & 7L;
                        long var103;
                        int var61 = (var103 = var75 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                        if (var61 == 0) {
                            throw UncheckedExceptions.rethrow(var67);
                        }
                        break label78;
                    }
                }

                var2 = var1;
                if (var2 != null) {
                    var1 &= -354386683;
                    var1 *= 268417159;
                    var1 -= -305775886;
                    var1 ^= -622315177;
                    var1 ^= -1812797864;
                    int var63 = var1 + 1;
                    int var64 = var1 * var63;
                    int var71 = var1 + 2;
                    int var65 = var64 * var71;
                    var1 += 3;
                    int var66 = var65 * var1;
                    var1 = var66 & 7;
                    if (var1 == 0) {
                        return;
                    }
                }
            }
        }

        IllegalArgumentException var60 = new IllegalArgumentException();
        throw var60;
    }

    private void XG(String var1) {
        Object var287 = null;
        Object var298 = null;
        Throwable var3 = null;
        String var321 = null;
        Throwable var33 = null;
        LongSupplier var344 = null;
        long var345 = 0L;
        label277: {
            AC var32;
            int var102;
            label274: {
                AC var347;
                label278: {
                    boolean var7;
                    label300: {
                        try {
                            var102 = tr;
                            var102 ^= 140448361;
                            Object var5 = null;
                            var102 >>>= 14;
                            var102 &= 720988375;
                            var102 *= -860019357;
                            var102 >>= 27;
                            var102 ^= -148032881;
                            Object var2 = null;
                            var102 <<= 6;
                            var102 -= 672163792;
                            var102 -= 233951657;
                            var102 ^= -1125236817;
                        } catch (Throwable var27) {
                            var3 = var27;
                            int var4 = tr;
                            int var42 = var4 ^ 848784634;
                            var7 = var27 instanceof IOException;
                            int var43 = var42 << 11;
                            int var44 = var43 | 1203110217;
                            int var45 = var44 | 634782468;
                            var102 = var45 ^ 661869709;
                            int var8 = var102 + 1;
                            var8 = var102 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                break label277;
                            }
                            break label300;
                        }

                        Integer var6 = var102;
                        if (var6 == null) {
                            break label277;
                        }

                        try {
                            var344 = this.V;
                        } catch (Throwable var26) {
                            var3 = var26;
                            int var58 = tr;
                            int var59 = var58 ^ 848784634;
                            var7 = var26 instanceof IOException;
                            int var60 = var59 << 11;
                            int var61 = var60 | 1203110217;
                            int var62 = var61 | 634782468;
                            var102 = var62 ^ 661869709;
                            int var386 = var102 + 1;
                            var386 = var102 * var386;
                            var386 &= 1;
                            if (var386 != 0) {
                                break label277;
                            }
                            break label300;
                        }
                        var102 = switch (var102) {
                            default -> var102 ^ 1447395492;
                            case 698636584 -> {
                                var102 -= -66824562;
                                yield var102 ^ 919477698;
                            }
                            case 811360104 -> var102 ^ -1123032771;
                        };
                        Integer var349 = var102;
                        if (var349 == null) {
                            break label277;
                        }

                        try {
                            var345 = var344.getAsLong();
                            var102 += 2132670595;
                            var102 >>= 21;
                            var102 ^= 1275732039;
                        } catch (Throwable var25) {
                            var3 = var25;
                            int var65 = tr;
                            int var66 = var65 ^ 848784634;
                            var7 = var25 instanceof IOException;
                            int var67 = var66 << 11;
                            int var68 = var67 | 1203110217;
                            int var69 = var68 | 634782468;
                            var102 = var69 ^ 661869709;
                            int var389 = var102 + 1;
                            var389 = var102 * var389;
                            var389 &= 1;
                            if (var389 != 0) {
                                break label277;
                            }
                            break label300;
                        }

                        long var392 = var102;
                        long var10 = var392 + 1L;
                        var10 = var392 * var10;
                        var392 = var10 & 1L;
                        long var404;
                        int var394 = (var404 = var392 - 0L) == 0L ? 0 : (var404 < 0L ? -1 : 1);
                        if (var394 != 0) {
                            break label277;
                        }

                        try {
                            var347 = d(var1, var345);
                        } catch (Throwable var24) {
                            var3 = var24;
                            int var73 = tr;
                            int var74 = var73 ^ 848784634;
                            var7 = var24 instanceof IOException;
                            int var75 = var74 << 11;
                            int var76 = var75 | 1203110217;
                            int var77 = var76 | 634782468;
                            var102 = var77 ^ 661869709;
                            int var395 = var102 + 1;
                            int var396 = var102 * var395;
                            int var397 = var396 & 1;
                            if (var397 != 0) {
                                break label277;
                            }
                            break label300;
                        }
                        var102 = switch (var102) {
                            default -> var102 ^ 1944446123;
                            case -1275732845 -> {
                                var102 &= -1347530934;
                                var102 += 1682064229;
                                var102 *= 1003205059;
                                yield var102 ^ 1635638770;
                            }
                            case -774859756 -> var102 ^ -2091189929;
                        };

                        try {
                            var347 = var347;
                            var102 |= -1611877273;
                            var102 -= 498376264;
                            var102 += 96963721;
                            var102 ^= -569284401;
                            break label278;
                        } catch (Throwable var23) {
                            var3 = var23;
                            int var82 = tr;
                            int var83 = var82 ^ 848784634;
                            var7 = var23 instanceof IOException;
                            int var84 = var83 << 11;
                            int var85 = var84 | 1203110217;
                            int var86 = var85 | 634782468;
                            var102 = var86 ^ 661869709;
                            int var398 = var102 + 1;
                            int var399 = var102 * var398;
                            int var400 = var399 & 1;
                            if (var400 != 0) {
                                break label277;
                            }
                        }
                    }

                    if (!var7) {
                        Integer var350 = switch (var102) {
                            case -930252864 -> {
                                var102 *= 1435737609;
                                var102 -= 544168408;
                                var102 |= 558601077;
                                var102 -= -1815605779;
                                yield var102 ^ -2128323142;
                            }
                            default -> var102 ^ 755694798;
                            case 1842535780 -> var102 ^ 1066740178;
                        };
                        if (var350 != null) {
                            throw UncheckedExceptions.rethrow(var3);
                        }
                        break label277;
                    }

                    var102 *= -1965656153;
                    var102 -= -1213353832;
                    var102 *= 921743245;
                    var102 += 400170767;
                    var102 ^= 1804332497;
                    IOException var269 = (IOException)var3;
                    var102 -= -1572247271;
                    var102 += 1861531105;
                    var102 *= 625586621;
                    var102 -= 1192874487;
                    var102 ^= 87198395;
                    AC var270 = new AC(null, var269, null);

                    var102 = switch (var102) {
                        case -1463699123 -> var102 ^ -41255232;
                        case -1009473820 -> {
                            var102 |= 346839947;
                            var102 |= 1775115827;
                            var102 <<= 6;
                            yield var102 ^ 1154545997;
                        }
                        default -> var102 ^ 1967116972;
                    };
                    var32 = var270;
                    var102 += 551595344;
                    var102 ^= 2045350605;
                    break label274;
                }

                var32 = var347;
                var102 += -832972174;
                var102 <<= 10;
                var102 |= -1643353170;
                var102 -= -905580192;
                var102 ^= 1361141598;
            }

            long var271 = var102;
            long var351 = var271 + 1L;
            var351 = var271 * var351;
            long var9 = var271 + 2L;
            var351 *= var9;
            var271 += 3L;
            var351 *= var271;
            var271 = var351 & 7L;
            long var405;
            int var274 = (var405 = var271 - 0L) == 0L ? 0 : (var405 < 0L ? -1 : 1);
            if (var274 == 0) {
                Object var275 = this.ZZ;
                Object var348 = var275;
                var102 += 792013606;
                var102 *= 1491553909;
                var102 ^= -987923233;
                Integer var355 = var102;
                label188:
                if (var355 != null) {
                    synchronized (var275){}
                    var102 *= -983377065;
                    var102 ^= -1208479499;

                    label280: {
                        label281: {
                            try {
                                var102 *= 100709443;
                                var102 *= 387179767;
                                var102 -= 1865107570;
                                var102 ^= -944958490;
                                this.AS = var32;
                                var102 |= 667549249;
                                var102 *= 1018736945;
                                var102 ^= 388081061;
                            } catch (Throwable var22) {
                                int var121 = tr;
                                int var122 = var121 ^ -900668510;
                                var33 = var22;
                                int var123 = var122 - -1667037039;
                                int var124 = var123 | -1432746838;
                                int var125 = var124 ^ 569355405;
                                int var126 = var125 ^ 1996494154;
                                var102 = var126 ^ 1617765786;
                                int var276 = var102 + 1;
                                int var277 = var102 * var276;
                                int var356 = var102 + 2;
                                int var278 = var277 * var356;
                                int var357 = var102 + 3;
                                int var279 = var278 * var357;
                                int var280 = var279 & 7;
                                if (var280 != 0) {
                                    break label188;
                                }
                                break label281;
                            }

                            Integer var281 = var102;
                            if (var281 == null) {
                                break label188;
                            }

                            try {
                                var287 = var32.art();
                                var102 &= 144421247;
                                var102 *= 574720579;
                                var102 *= -1211125071;
                                var102 ^= -40164120;
                            } catch (Throwable var21) {
                                int var135 = tr;
                                int var136 = var135 ^ -900668510;
                                var33 = var21;
                                int var137 = var136 - -1667037039;
                                int var138 = var137 | -1432746838;
                                int var139 = var138 ^ 569355405;
                                int var140 = var139 ^ 1996494154;
                                var102 = var140 ^ 1617765786;
                                int var282 = var102 + 1;
                                int var283 = var102 * var282;
                                int var358 = var102 + 2;
                                int var284 = var283 * var358;
                                int var359 = var102 + 3;
                                int var285 = var284 * var359;
                                int var286 = var285 & 7;
                                if (var286 != 0) {
                                    break label188;
                                }
                                break label281;
                            }

                            Integer var360 = var102;
                            if (var360 == null) {
                                break label188;
                            }

                            label240: {
                                label303: {
                                    try {
                                        if (var287 == null) {
                                            break label303;
                                        }
                                    } catch (Throwable var20) {
                                        int var145 = tr;
                                        int var146 = var145 ^ -900668510;
                                        var33 = var20;
                                        int var147 = var146 - -1667037039;
                                        int var148 = var147 | -1432746838;
                                        int var149 = var148 ^ 569355405;
                                        int var150 = var149 ^ 1996494154;
                                        var102 = var150 ^ 1617765786;
                                        int var288 = var102 + 1;
                                        int var289 = var102 * var288;
                                        int var361 = var102 + 2;
                                        int var290 = var289 * var361;
                                        int var362 = var102 + 3;
                                        int var291 = var290 * var362;
                                        int var292 = var291 & 7;
                                        if (var292 != 0) {
                                            break label188;
                                        }
                                        break label281;
                                    }
                                    var102 = switch (var102) {
                                        case -1877481828 -> var102 ^ 2106687322;
                                        default -> var102 ^ -296441486;
                                        case -158594522 -> {
                                            var102 -= -1357802435;
                                            var102 *= -1510867495;
                                            var102 |= 746584934;
                                            var102 &= 458070102;
                                            yield var102 ^ 1358436920;
                                        }
                                    };

                                    var102 = switch (var102) {
                                        case -1930022959 -> var102 ^ 1689825167;
                                        default -> var102 ^ 1292463939;
                                        case 1521844862 -> {
                                            var102 ^= 2035384399;
                                            var102 -= -787750254;
                                            var102 &= -205873670;
                                            yield var102 ^ 490536083;
                                        }
                                    };

                                    try {
                                        var298 = var32.track();
                                        var102 <<= 6;
                                        var102 *= -636198395;
                                        var102 <<= 5;
                                        var102 -= -1475546921;
                                        var102 ^= -523453399;
                                    } catch (Throwable var18) {
                                        int var160 = tr;
                                        int var161 = var160 ^ -900668510;
                                        var33 = var18;
                                        int var162 = var161 - -1667037039;
                                        int var163 = var162 | -1432746838;
                                        int var164 = var163 ^ 569355405;
                                        int var165 = var164 ^ 1996494154;
                                        var102 = var165 ^ 1617765786;
                                        int var293 = var102 + 1;
                                        int var294 = var102 * var293;
                                        int var363 = var102 + 2;
                                        int var295 = var294 * var363;
                                        int var364 = var102 + 3;
                                        int var296 = var295 * var364;
                                        int var297 = var296 & 7;
                                        if (var297 != 0) {
                                            break label188;
                                        }
                                        break label281;
                                    }

                                    Integer var365 = var102;
                                    if (var365 == null) {
                                        break label188;
                                    }

                                    label304: {
                                        try {
                                            if (var298 == null) {
                                                break label304;
                                            }
                                        } catch (Throwable var19) {
                                            int var171 = tr;
                                            int var172 = var171 ^ -900668510;
                                            var33 = var19;
                                            int var173 = var172 - -1667037039;
                                            int var174 = var173 | -1432746838;
                                            int var175 = var174 ^ 569355405;
                                            int var176 = var175 ^ 1996494154;
                                            var102 = var176 ^ 1617765786;
                                            int var299 = var102 + 1;
                                            int var300 = var102 * var299;
                                            int var366 = var102 + 2;
                                            int var301 = var300 * var366;
                                            int var367 = var102 + 3;
                                            int var302 = var301 * var367;
                                            int var303 = var302 & 7;
                                            if (var303 != 0) {
                                                break label188;
                                            }
                                            break label281;
                                        }

                                        var102 -= 201190960;
                                        var102 ^= 883973688;
                                        Integer var304 = var102;
                                        if (var304 == null) {
                                            break label188;
                                        }

                                        try {
                                            var102 |= 587744011;
                                            var102 ^= -967753683;
                                            var102 ^= 1622394394;
                                        } catch (Throwable var17) {
                                            int var179 = tr;
                                            int var180 = var179 ^ -900668510;
                                            var33 = var17;
                                            int var181 = var180 - -1667037039;
                                            int var182 = var181 | -1432746838;
                                            int var183 = var182 ^ 569355405;
                                            int var184 = var183 ^ 1996494154;
                                            var102 = var184 ^ 1617765786;
                                            int var305 = var102 + 1;
                                            int var306 = var102 * var305;
                                            int var368 = var102 + 2;
                                            int var307 = var306 * var368;
                                            int var369 = var102 + 3;
                                            int var308 = var307 * var369;
                                            int var309 = var308 & 7;
                                            if (var309 != 0) {
                                                break label188;
                                            }
                                            break label281;
                                        }

                                        int var310 = var102 + 1;
                                        int var311 = var102 * var310;
                                        int var370 = var102 + 2;
                                        int var312 = var311 * var370;
                                        int var371 = var102 + 3;
                                        int var313 = var312 * var371;
                                        int var314 = var313 & 7;
                                        if (var314 != 0) {
                                            break label188;
                                        }

                                        try {
                                            FX var320 = var32.track();
                                            var102 ^= -994872535;
                                            var102 |= -925124615;
                                            var102 -= -1166226879;
                                            var102 ^= 310986509;
                                            var321 = var320.artKey();
                                        } catch (Throwable var16) {
                                            int var188 = tr;
                                            int var189 = var188 ^ -900668510;
                                            var33 = var16;
                                            int var190 = var189 - -1667037039;
                                            int var191 = var190 | -1432746838;
                                            int var192 = var191 ^ 569355405;
                                            int var193 = var192 ^ 1996494154;
                                            var102 = var193 ^ 1617765786;
                                            int var315 = var102 + 1;
                                            int var316 = var102 * var315;
                                            int var372 = var102 + 2;
                                            int var317 = var316 * var372;
                                            int var373 = var102 + 3;
                                            int var318 = var317 * var373;
                                            int var319 = var318 & 7;
                                            if (var319 != 0) {
                                                break label188;
                                            }
                                            break label281;
                                        }
                                        var102 = switch (var102) {
                                            case -2108130026 -> var102 ^ 1609470562;
                                            default -> var102 ^ -1101501679;
                                            case 30911153 -> {
                                                var102 |= -504878161;
                                                var102 -= 943206810;
                                                yield var102 ^ 75025501;
                                            }
                                        };

                                        try {
                                            this.LC = var321;
                                            var102 &= -2032877583;
                                            var102 ^= -1687179603;
                                            byte[] var34 = var32.art();
                                            var102 &= -1506016396;
                                            var102 *= 424505071;
                                            var102 &= 1929107291;
                                            var102 ^= -1029488531;
                                            var102 ^= 936417038;
                                            this.C = var34;
                                        } catch (Throwable var15) {
                                            int var201 = tr;
                                            int var202 = var201 ^ -900668510;
                                            var33 = var15;
                                            int var203 = var202 - -1667037039;
                                            int var204 = var203 | -1432746838;
                                            int var205 = var204 ^ 569355405;
                                            int var206 = var205 ^ 1996494154;
                                            var102 = var206 ^ 1617765786;
                                            int var322 = var102 + 1;
                                            int var323 = var102 * var322;
                                            int var374 = var102 + 2;
                                            int var324 = var323 * var374;
                                            int var375 = var102 + 3;
                                            int var325 = var324 * var375;
                                            int var326 = var325 & 7;
                                            if (var326 != 0) {
                                                break label188;
                                            }
                                            break label281;
                                        }

                                        switch (var102) {
                                            case -1211421397:
                                            default:
                                                var102 ^= 578667444;
                                                break label240;
                                            case -675049173:
                                                var102 -= -1167348200;
                                                var102 |= 1740038742;
                                                var102 ^= -32066527;
                                                var102 ^= -1319339975;
                                                break label240;
                                            case 1460913364:
                                                var102 ^= 1056591380;
                                                break label240;
                                        }
                                    }

                                    var102 &= -1203949572;
                                    var102 *= 525941305;
                                    var102 &= -154968928;
                                    var102 ^= 608010063;
                                    break label240;
                                }

                                var102 |= -135348643;
                                var102 &= 109625770;
                                var102 |= 1274832120;
                                var102 ^= 2135018421;
                            }

                            int var35 = var102 + 1;
                            int var36 = var102 * var35;
                            int var327 = var102 + 2;
                            int var37 = var36 * var327;
                            int var328 = var102 + 3;
                            int var38 = var37 * var328;
                            int var39 = var38 & 7;
                            if (var39 != 0) {
                                break label188;
                            }

                            try {
                                var102 ^= -2005501619;
                                var102 ^= -1417148776;
                                var102 ^= 1328884323;
                                var102 *= 2038194785;
                                var102 ^= -1080844707;
                            } catch (Throwable var14) {
                                int var224 = tr;
                                int var225 = var224 ^ -900668510;
                                var33 = var14;
                                int var226 = var225 - -1667037039;
                                int var227 = var226 | -1432746838;
                                int var228 = var227 ^ 569355405;
                                int var229 = var228 ^ 1996494154;
                                var102 = var229 ^ 1617765786;
                                int var329 = var102 + 1;
                                int var330 = var102 * var329;
                                int var376 = var102 + 2;
                                int var331 = var330 * var376;
                                int var377 = var102 + 3;
                                int var332 = var331 * var377;
                                int var333 = var332 & 7;
                                if (var333 != 0) {
                                    break label188;
                                }
                                break label281;
                            }

                            var351 = var102;
                            var9 = var351 + 1L;
                            var9 = var351 * var9;
                            var351 = var9 & 1L;
                            long var406;
                            int var40 = (var406 = var351 - 0L) == 0L ? 0 : (var406 < 0L ? -1 : 1);
                            if (var40 != 0) {
                                break label188;
                            }

                            try {
                                Object var41 = this.ZZ;
                                var102 -= -1201010240;
                                var102 |= 670379336;
                                var102 |= 1749486635;
                                var102 ^= -1960496077;
                                var41.notifyAll();
                                var102 ^= 1785896173;
                                var102 &= 1029856982;
                                var102 -= -1775185197;
                                var102 >>>= 2;
                                var102 ^= -1272664184;
                                var102 *= -815060549;
                                var102 *= 1957376689;
                                var102 += 1289477825;
                                var102 += -802853844;
                                var102 ^= -816231819;
                                break label280;
                            } catch (Throwable var13) {
                                int var235 = tr;
                                int var236 = var235 ^ -900668510;
                                var33 = var13;
                                int var237 = var236 - -1667037039;
                                int var238 = var237 | -1432746838;
                                int var239 = var238 ^ 569355405;
                                int var240 = var239 ^ 1996494154;
                                var102 = var240 ^ 1617765786;
                                int var334 = var102 + 1;
                                int var335 = var102 * var334;
                                int var380 = var102 + 2;
                                int var336 = var335 * var380;
                                int var381 = var102 + 3;
                                int var337 = var336 * var381;
                                int var338 = var337 & 7;
                                if (var338 != 0) {
                                    break label188;
                                }
                            }
                        }

                        while (true) {
                            try {
                                break;
                            } catch (Throwable var12) {
                                int var241 = tr;
                                int var242 = var241 ^ -900668510;
                                var33 = var12;
                                int var243 = var242 - -1667037039;
                                int var244 = var243 | -1432746838;
                                int var245 = var244 ^ 569355405;
                                int var246 = var245 ^ 1996494154;
                                var102 = var246 ^ 1617765786;
                                int var339 = var102 + 1;
                                int var340 = var102 * var339;
                                int var382 = var102 + 2;
                                int var341 = var340 * var382;
                                int var383 = var102 + 3;
                                int var342 = var341 * var383;
                                int var343 = var342 & 7;
                                if (var343 != 0) {
                                    break label188;
                                }
                            }
                        }

                        switch (var102) {
                            case -1994534218:
                                var102 ^= -1534235133;
                                var102 ^= -152468591;
                                var102 -= 897544510;
                                var102 ^= -119070122;
                                break;
                            case -670779824:
                                var102 ^= -1118285096;
                                break;
                            case 542527266:
                            default:
                                var102 ^= 1108000109;
                        }

                        throw UncheckedExceptions.rethrow(var33);
                    }
                    var102 = switch (var102) {
                        case 800518255 -> {
                            var102 |= -1839939917;
                            yield var102 ^ 1322921677;
                        }
                        case 864843962 -> var102 ^ -908702854;
                        default -> var102 ^ 1931066653;
                    };
                    int var28 = var102 + 1;
                    var28 = var102 * var28;
                    var28 &= 1;
                    if (var28 == 0) {
                        return;
                    }
                }
            }
        }

        AssertionError var31 = new AssertionError();
        throw var31;
    }

    public static AC d(String var0, long var1) throws IOException {
        com.google.gson.JsonElement var285 = null;
        com.google.gson.JsonObject var286 = null;
        com.google.gson.JsonObject var287 = null;
        boolean var385 = false;
        java.util.Base64.Decoder var419 = null;
        label342: {
            Throwable var8;
            label376: {
                int var76;
                try {
                    var76 = tr;
                    var76 ^= -833078023;
                    Object var3 = null;
                    var76 |= 293311837;
                    var76 += 1077350610;
                    var76 &= -893346478;
                    var76 <<= 27;
                    var76 ^= -2043019661;
                    Object var6 = null;
                } catch (IllegalStateException | JsonParseException var32) {
                    var76 = tr;
                    var76 ^= 746417589;
                    var8 = R(var32);
                    var76 &= 1030810454;
                    var76 >>= 22;
                    var76 -= 656388432;
                    var76 *= 68785677;
                    var76 ^= -1574140291;
                    long var9 = var76;
                    long var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var9 = var11 & 1L;
                    long var449;
                    int var300 = (var449 = var9 - 0L) == 0L ? 0 : (var449 < 0L ? -1 : 1);
                    if (var300 != 0) {
                        break label342;
                    }
                    break label376;
                }
                var76 = switch (var76) {
                    case -575803446 -> var76 ^ 1883934685;
                    default -> var76 ^ -163073475;
                    case 104463987 -> {
                        var76 |= -1308513323;
                        yield var76 ^ -20976458;
                    }
                };
                Integer var7 = var76;
                if (var7 == null) {
                    break label342;
                }

                try {
                    var285 = JsonParser.parseString(var0);
                    var76 &= 662880404;
                    var76 &= -593598345;
                    var76 |= -610137567;
                    var76 -= -217932562;
                    var76 ^= 1510976610;
                } catch (IllegalStateException | JsonParseException var31) {
                    var76 = tr;
                    var76 ^= 746417589;
                    var8 = R(var31);
                    var76 &= 1030810454;
                    var76 >>= 22;
                    var76 -= 656388432;
                    var76 *= 68785677;
                    var76 ^= -1574140291;
                    long var301 = var76;
                    long var324 = var301 + 1L;
                    var324 = var301 * var324;
                    var301 = var324 & 1L;
                    long var450;
                    int var303 = (var450 = var301 - 0L) == 0L ? 0 : (var450 < 0L ? -1 : 1);
                    if (var303 != 0) {
                        break label342;
                    }
                    break label376;
                }

                int var288 = var76 + 1;
                int var289 = var76 * var288;
                int var290 = var289 & 1;
                if (var290 != 0) {
                    break label342;
                }

                try {
                    var286 = var285.getAsJsonObject();
                    var76 -= -1078455568;
                    var76 |= 2044013473;
                    var76 &= 983158407;
                    var76 += 1249290547;
                    var76 ^= -664009485;
                } catch (IllegalStateException | JsonParseException var30) {
                    var76 = tr;
                    var76 ^= 746417589;
                    var8 = R(var30);
                    var76 &= 1030810454;
                    var76 >>= 22;
                    var76 -= 656388432;
                    var76 *= 68785677;
                    var76 ^= -1574140291;
                    long var304 = var76;
                    long var326 = var304 + 1L;
                    var326 = var304 * var326;
                    var304 = var326 & 1L;
                    long var451;
                    int var306 = (var451 = var304 - 0L) == 0L ? 0 : (var451 < 0L ? -1 : 1);
                    if (var306 != 0) {
                        break label342;
                    }
                    break label376;
                }

                int var291 = var76 + 1;
                int var292 = var76 * var291;
                int var307 = var76 + 2;
                int var293 = var292 * var307;
                var307 = var76 + 3;
                int var294 = var293 * var307;
                int var295 = var294 & 7;
                if (var295 != 0) {
                    break label342;
                }

                try {
                    var287 = var286;
                    var76 -= 806741355;
                    var76 += -1091774941;
                    var76 &= -553426743;
                    var76 |= -2051288236;
                    var76 ^= 765994332;
                } catch (IllegalStateException | JsonParseException var29) {
                    var76 = tr;
                    var76 ^= 746417589;
                    var8 = R(var29);
                    var76 &= 1030810454;
                    var76 >>= 22;
                    var76 -= 656388432;
                    var76 *= 68785677;
                    var76 ^= -1574140291;
                    long var309 = var76;
                    long var328 = var309 + 1L;
                    var328 = var309 * var328;
                    long var310 = var328 & 1L;
                    long var452;
                    var307 = (var452 = var310 - 0L) == 0L ? 0 : (var452 < 0L ? -1 : 1);
                    if (var307 != 0) {
                        break label342;
                    }
                    break label376;
                }

                int var34 = var76 + 1;
                var34 = var76 * var34;
                var34 &= 1;
                if (var34 == 0) {
                    var76 *= -2066383715;
                    var76 &= -1094776036;
                    var76 ^= -828691606;
                    String var37 = dT.N(var287, "s", "");
                    boolean var297 = var37.equals("error");
                    var76 += 1330449097;
                    var76 >>>= 18;
                    var76 -= -1854053956;
                    var76 ^= -415580245;
                    if (var297) {
                        var76 -= -847370761;
                        var76 ^= -1255028818;
                        String var322 = dT.N(var287, "msg", "media session error");
                        IOException var321 = new IOException(var322);
                        return new AC(null, var321, null);
                    }
                    var76 = switch (var76) {
                        case -1984423059 -> {
                            var76 *= 142425507;
                            var76 &= -637594147;
                            yield var76 ^ 1807018099;
                        }
                        default -> var76 ^ -295127008;
                        case -502543767 -> var76 ^ 26460627;
                    };
                    boolean var298 = var37.equals("Playing");
                    var76 *= 1685479457;
                    var76 &= -826693452;
                    var76 <<= 11;
                    var76 += 1206071364;
                    var76 ^= 1334707396;
                    var307 = var76 + 1;
                    var307 = var76 * var307;
                    var307 &= 1;
                    if (var307 == 0) {
                        if (!var298) {
                            var76 ^= 1231135426;
                            var76 += 292766526;
                            var76 ^= 1146985071;
                            var76 -= 364420221;
                            var76 ^= 1773194386;
                            long var315 = var76;
                            long var330 = var315 + 1L;
                            var330 = var315 * var330;
                            long var13 = var315 + 2L;
                            var330 *= var13;
                            long var316 = var315 + 3L;
                            var330 *= var316;
                            long var317 = var330 & 7L;
                            long var453;
                            var307 = (var453 = var317 - 0L) == 0L ? 0 : (var453 < 0L ? -1 : 1);
                            if (var307 != 0) {
                                break label342;
                            }

                            boolean var38 = var37.equals("Paused");

                            var76 = switch (var76) {
                                default -> var76 ^ -1011051598;
                                case 1169273888 -> var76 ^ -1269867020;
                                case 1709067232 -> {
                                    var76 *= 1029644617;
                                    var76 |= -206132400;
                                    var76 &= 1791328530;
                                    yield var76 ^ -175602511;
                                }
                            };
                            Integer var319 = var76;
                            if (var319 == null) {
                                break label342;
                            }

                            if (!var38) {
                                var76 ^= 1585830531;
                                var76 *= 1882028177;
                                var76 += -2030843879;
                                var76 &= 712556162;
                                var76 ^= -1219943690;
                                Integer var39 = var76;
                                if (var39 != null) {
                                    return new AC(null, null, null);
                                }
                                break label342;
                            }

                            var76 += -1579784293;
                            var76 -= -1435608884;
                            var76 += -1638723818;
                            var76 ^= 292017542;
                        } else {
                            var76 *= -395867943;
                            var76 ^= 400676480;
                        }

                        String var40 = dT.N(var287, "app", "");
                        var76 &= -2065142238;
                        var76 *= 1117047599;
                        var76 ^= -1534015852;
                        var76 ^= 911491602;
                        String var320 = dT.N(var287, "title", "");
                        String var10 = dT.N(var287, "artist", "");
                        String var334 = dT.N(var287, "album", "");
                        boolean var12 = var320.isBlank();
                        if (var12) {
                            var76 *= 1813818569;
                            var76 ^= 1995149915;
                            var76 *= 593146829;
                            var76 ^= -771374469;
                            return new AC(null, null, null);
                        }

                        var76 -= -92462510;
                        var76 += -1440824122;
                        var76 += 653672704;
                        var76 >>>= 5;
                        var76 ^= -1783262881;
                        Integer var335 = var76;
                        if (var335 != null) {
                            long var336 = dT.M(var287, "duration");
                            long var337 = Math.max(0L, var336);
                            long var14 = dT.M(var287, "position");
                            var14 = Math.max(0L, var14);
                            long var16 = dT.M(var287, "updated");
                            var76 >>= 18;
                            var76 ^= 1810256713;
                            var76 >>>= 18;
                            var76 ^= -408486426;
                            Integer var18 = var76;
                            if (var18 != null) {
                                label355: {
                                    long var368 = dT.M(var287, "now");
                                    long var369 = var368 - var16;
                                    long var454;
                                    int var339 = (var454 = var16 - 0L) == 0L ? 0 : (var454 < 0L ? -1 : 1);
                                    if (var339 > 0) {
                                        var76 &= 1963856973;
                                        var76 -= 1946954149;
                                        var76 ^= 1732425153;
                                        int var340 = var76 + 1;
                                        int var341 = var76 * var340;
                                        int var17 = var76 + 2;
                                        int var342 = var341 * var17;
                                        var17 = var76 + 3;
                                        int var343 = var342 * var17;
                                        int var344 = var343 & 7;
                                        if (var344 != 0) {
                                            break label342;
                                        }

                                        long var455;
                                        int var345 = (var455 = var369 - 0L) == 0L ? 0 : (var455 < 0L ? -1 : 1);

                                        var76 = switch (var76) {
                                            default -> var76 ^ -123814498;
                                            case -1749331110 -> {
                                                var76 &= 1753918173;
                                                var76 ^= 1383482810;
                                                var76 *= -52032855;
                                                var76 |= -1819736838;
                                                yield var76 ^ -4184459;
                                            }
                                            case -808904101 -> var76 ^ 1466002981;
                                        };
                                        Integer var364 = var76;
                                        if (var364 == null) {
                                            break label342;
                                        }

                                        label293:
                                        if (var345 >= 0) {
                                            var76 += 1538304533;
                                            var76 ^= -1621361879;
                                            var76 ^= 1186230513;
                                            var76 <<= 11;
                                            var76 ^= -725056518;
                                            var16 = var76;
                                            long var20 = var16 + 1L;
                                            var20 = var16 * var20;
                                            long var22 = var16 + 2L;
                                            var20 *= var22;
                                            var16 += 3L;
                                            var20 *= var16;
                                            var16 = var20 & 7L;
                                            long var456;
                                            int var349 = (var456 = var16 - 0L) == 0L ? 0 : (var456 < 0L ? -1 : 1);
                                            if (var349 != 0) {
                                                break label342;
                                            }

                                            long var457;
                                            int var350 = (var457 = var337 - 0L) == 0L ? 0 : (var457 < 0L ? -1 : 1);

                                            var76 = switch (var76) {
                                                case -1473027078 -> {
                                                    var76 &= -1950404684;
                                                    yield var76 ^ -238222583;
                                                }
                                                case 40445456 -> var76 ^ -118301691;
                                                default -> var76 ^ 832413450;
                                            };
                                            if (var350 != 0) {
                                                var76 ^= -173011915;
                                                var76 ^= -45395739;
                                                int var351 = var76 + 1;
                                                int var352 = var76 * var351;
                                                int var365 = var76 + 2;
                                                int var353 = var352 * var365;
                                                var365 = var76 + 3;
                                                int var354 = var353 * var365;
                                                int var355 = var354 & 7;
                                                if (var355 != 0) {
                                                    break label342;
                                                }

                                                long var458;
                                                int var356 = (var458 = var369 - var337) == 0L ? 0 : (var458 < 0L ? -1 : 1);
                                                var76 &= 1340340707;
                                                var76 ^= 1626733803;
                                                var20 = var76;
                                                var22 = var20 + 1L;
                                                var22 = var20 * var22;
                                                var20 = var22 & 1L;
                                                long var459;
                                                var365 = (var459 = var20 - 0L) == 0L ? 0 : (var459 < 0L ? -1 : 1);
                                                if (var365 != 0) {
                                                    break label342;
                                                }

                                                if (var356 > 0) {
                                                    switch (var76) {
                                                        case -2060944157:
                                                            var76 ^= 265903744;
                                                            break label293;
                                                        case -1393687670:
                                                        default:
                                                            var76 ^= -536932497;
                                                            break label293;
                                                        case 569672842:
                                                            var76 &= -1533356968;
                                                            var76 |= -1533989172;
                                                            var76 ^= 506954378;
                                                            break label293;
                                                    }
                                                }

                                                var76 &= 597708839;
                                                var76 |= -803492346;
                                                var76 -= 1212145262;
                                                var76 ^= -963425484;
                                                var76 ^= -40721584;
                                            } else {
                                                var76 |= -1668355174;
                                                var76 *= 1189773329;
                                                var76 += 1426521811;
                                                var76 ^= -776339006;
                                            }

                                            var16 = var76;
                                            var20 = var16 + 1L;
                                            var20 = var16 * var20;
                                            var22 = var16 + 2L;
                                            var20 *= var22;
                                            var16 += 3L;
                                            var20 *= var16;
                                            var16 = var20 & 7L;
                                            long var460;
                                            int var361 = (var460 = var16 - 0L) == 0L ? 0 : (var460 < 0L ? -1 : 1);
                                            if (var361 != 0) {
                                                break label342;
                                            }

                                            var16 = var1 - var369;

                                            var76 = switch (var76) {
                                                case -1837488132 -> {
                                                    var76 <<= 29;
                                                    var76 *= 1113966499;
                                                    var76 -= 397697258;
                                                    yield var76 ^ 1054399825;
                                                }
                                                case -1807534894 -> var76 ^ 1359514258;
                                                default -> var76 ^ 717288005;
                                            };
                                            long var371 = var76;
                                            var20 = var371 + 1L;
                                            var20 = var371 * var20;
                                            var22 = var371 + 2L;
                                            var20 *= var22;
                                            long var372 = var371 + 3L;
                                            var20 *= var372;
                                            long var373 = var20 & 7L;
                                            long var461;
                                            int var374 = (var461 = var373 - 0L) == 0L ? 0 : (var461 < 0L ? -1 : 1);
                                            if (var374 != 0) {
                                                break label342;
                                            }

                                            var16 = var16;
                                            var76 &= 1571591077;
                                            var76 &= 131593723;
                                            var76 *= -1322266987;
                                            var76 ^= 1040051503;
                                            break label355;
                                        } else {
                                            switch (var76) {
                                                case 464278145:
                                                default:
                                                    var76 ^= 278802703;
                                                    break;
                                                case 643970419:
                                                    var76 ^= -1090103309;
                                                    break;
                                                case 1278175887:
                                                    var76 &= 469777416;
                                                    var76 -= 835563788;
                                                    var76 ^= 1620335290;
                                            }
                                        }
                                    } else {
                                        var76 |= -129687674;
                                        var76 += -827340201;
                                        var76 -= -675346605;
                                        var76 *= 2009009653;
                                        var76 ^= 713680820;
                                    }

                                    var18 = var76;
                                    if (var18 == null) {
                                        break label342;
                                    }

                                    var16 = var1;
                                    switch (var76) {
                                        case -1163514810:
                                            var76 *= 2001519307;
                                            var76 -= -1402117464;
                                            var76 ^= -2080446624;
                                            break;
                                        case -623994575:
                                        default:
                                            var76 ^= -1703566329;
                                            break;
                                        case 1941363778:
                                            var76 ^= 1986443080;
                                    }
                                }

                                var18 = var76;
                                if (var18 != null) {
                                    String var376 = var320 + "|" + var10 + "|" + var334;
                                    int var377 = var376.hashCode();
                                    String var378 = Integer.toHexString(var377);
                                    String var379 = "smtc:" + var378;
                                    var76 ^= 2119333711;
                                    var76 &= -1576875489;
                                    var76 += -1508064660;
                                    var76 ^= -1938373269;
                                    long var19 = var76;
                                    long var21 = var19 + 1L;
                                    var21 = var19 * var21;
                                    long var23 = var19 + 2L;
                                    var21 *= var23;
                                    var19 += 3L;
                                    var21 *= var19;
                                    var19 = var21 & 7L;
                                    long var462;
                                    int var382 = (var462 = var19 - 0L) == 0L ? 0 : (var462 < 0L ? -1 : 1);
                                    if (var382 == 0) {
                                        byte[] var406;
                                        String var383 = dT.N(var287, "art", "");
                                        String var384 = var383;
                                        var406 = null;
                                        boolean var410 = var383.isEmpty();
                                        label264:
                                        if (!var410) {
                                            var76 = switch (var76) {
                                                default -> var76 ^ -444748756;
                                                case 711706602 -> {
                                                    var76 &= -294414257;
                                                    var76 >>>= 5;
                                                    var76 -= -152216731;
                                                    yield var76 ^ 1053005072;
                                                }
                                                case 1634834996 -> var76 ^ 414029426;
                                            };
                                            int var411 = var76 + 1;
                                            int var412 = var76 * var411;
                                            int var434 = var76 + 2;
                                            int var413 = var412 * var434;
                                            var434 = var76 + 3;
                                            int var414 = var413 * var434;
                                            int var415 = var414 & 7;
                                            if (var415 != 0) {
                                                break label342;
                                            }

                                            label382: {
                                                Throwable var4;
                                                label354: {
                                                    try {
                                                        var419 = Base64.getDecoder();
                                                        var76 -= -797289012;
                                                        var76 |= 1567685619;
                                                        var76 -= -187028476;
                                                        var76 -= 1224898163;
                                                        var76 ^= -2094404513;
                                                    } catch (Throwable var28) {
                                                        var4 = var28;
                                                        int var216 = tr;
                                                        int var217 = var216 ^ 1011233946;
                                                        var385 = var28 instanceof IllegalArgumentException;
                                                        int var218 = var217 * 1391559985;
                                                        int var219 = var218 * -1237411409;
                                                        var76 = var219 ^ 1805968975;
                                                        var21 = var76;
                                                        var23 = var21 + 1L;
                                                        var23 = var21 * var23;
                                                        var21 = var23 & 1L;
                                                        long var463;
                                                        int var418 = (var463 = var21 - 0L) == 0L ? 0 : (var463 < 0L ? -1 : 1);
                                                        if (var418 != 0) {
                                                            break label342;
                                                        }
                                                        break label354;
                                                    }

                                                    var434 = var76 + 1;
                                                    var434 = var76 * var434;
                                                    var434 &= 1;
                                                    if (var434 != 0) {
                                                        break label342;
                                                    }

                                                    try {
                                                        byte[] var392 = var419.decode(var384);
                                                        var76 |= 449452146;
                                                        var76 ^= -893660729;
                                                        var406 = var392;
                                                        break label382;
                                                    } catch (Throwable var27) {
                                                        var4 = var27;
                                                        int var226 = tr;
                                                        int var227 = var226 ^ 1011233946;
                                                        var385 = var27 instanceof IllegalArgumentException;
                                                        int var228 = var227 * 1391559985;
                                                        int var229 = var228 * -1237411409;
                                                        var76 = var229 ^ 1805968975;
                                                        var21 = var76;
                                                        var23 = var21 + 1L;
                                                        var23 = var21 * var23;
                                                        var21 = var23 & 1L;
                                                        long var464;
                                                        int var422 = (var464 = var21 - 0L) == 0L ? 0 : (var464 < 0L ? -1 : 1);
                                                        if (var422 != 0) {
                                                            break label342;
                                                        }
                                                    }
                                                }

                                                if (!var385) {
                                                    var76 |= -558975760;
                                                    var76 ^= -1275273046;
                                                    var76 -= 288446302;
                                                    var76 &= 1759304319;
                                                    var76 ^= 158829788;
                                                    var21 = var76;
                                                    var23 = var21 + 1L;
                                                    var23 = var21 * var23;
                                                    var21 = var23 & 1L;
                                                    long var465;
                                                    int var391 = (var465 = var21 - 0L) == 0L ? 0 : (var465 < 0L ? -1 : 1);
                                                    if (var391 == 0) {
                                                        throw UncheckedExceptions.rethrow(var4);
                                                    }
                                                    break label342;
                                                }

                                                var76 <<= 28;
                                                var76 -= 533720837;
                                                var76 ^= 1705675768;
                                                int var386 = var76 + 1;
                                                int var387 = var76 * var386;
                                                int var423 = var76 + 2;
                                                int var388 = var387 * var423;
                                                int var424 = var76 + 3;
                                                int var389 = var388 * var424;
                                                int var390 = var389 & 7;
                                                if (var390 != 0) {
                                                    break label342;
                                                }

                                                IllegalArgumentException var281 = (IllegalArgumentException)var4;

                                                var76 = switch (var76) {
                                                    case -2024000465 -> var76 ^ -1043156134;
                                                    default -> var76 ^ -1814552077;
                                                    case 1973066499 -> {
                                                        var76 ^= 590228494;
                                                        var76 -= 1475709556;
                                                        var76 -= 188092214;
                                                        yield var76 ^ 1219628605;
                                                    }
                                                };
                                                int var45 = var76 + 1;
                                                int var46 = var76 * var45;
                                                int var47 = var46 & 1;
                                                if (var47 != 0) {
                                                    break label342;
                                                }

                                                var76 -= 1282630457;
                                                var76 ^= -1224604578;
                                                break label264;
                                            }
                                            var76 = switch (var76) {
                                                default -> var76 ^ 86443513;
                                                case -1343086967 -> var76 ^ 612902196;
                                                case 1950705844 -> {
                                                    var76 -= 2107771103;
                                                    var76 <<= 26;
                                                    var76 |= -1922716048;
                                                    var76 |= -1760777639;
                                                    yield var76 ^ -1021463796;
                                                }
                                            };
                                            int var48 = var76 + 1;
                                            var48 = var76 * var48;
                                            int var282 = var76 + 2;
                                            var48 *= var282;
                                            var282 = var76 + 3;
                                            var48 *= var282;
                                            var48 &= 7;
                                            if (var48 != 0) {
                                                break label342;
                                            }

                                            var76 -= 946369527;
                                            var76 ^= 1036131589;
                                        } else {
                                            var76 &= 778931793;
                                            var76 &= 1968532700;
                                            var76 ^= -108744645;
                                        }

                                        int var53 = var76 + 1;
                                        var53 = var76 * var53;
                                        var53 &= 1;
                                        if (var53 == 0) {
                                            Locale var56 = Locale.ROOT;
                                            String var57 = var40.toLowerCase(var56);
                                            int var58 = (var57.contains("spotify")) ? 1 : 0;

                                            var76 = switch (var76) {
                                                case -1581214393 -> var76 ^ 1663139943;
                                                default -> var76 ^ 1253583339;
                                                case -641354629 -> {
                                                    var76 *= -1067199651;
                                                    var76 <<= 2;
                                                    var76 ^= -920079595;
                                                    var76 |= -1139682132;
                                                    yield var76 ^ -186408395;
                                                }
                                            };
                                            Integer var284 = var76;
                                            if (var284 != null) {
                                                String var59;
                                                if (var58 != 0) {
                                                    var76 |= -1873380952;
                                                    var76 <<= 23;
                                                    var76 ^= -1506440706;
                                                    var59 = "Spotify";
                                                    switch (var76) {
                                                        case -311225717:
                                                        default:
                                                            var76 ^= -1759603100;
                                                            break;
                                                        case 458831553:
                                                            var76 ^= 379908662;
                                                            break;
                                                        case 2050329086:
                                                            var76 |= 364860924;
                                                            var76 ^= -938183002;
                                                    }
                                                } else {
                                                    var76 -= -692333510;
                                                    var76 *= 527534489;
                                                    var76 >>>= 13;
                                                    var76 ^= 881276004;
                                                    String var41 = FM(var40);
                                                    var76 &= 313191729;
                                                    var76 &= -2074926061;
                                                    var76 ^= 2026103258;
                                                    var59 = var41;
                                                    var76 >>= 1;
                                                    var76 ^= -1949611595;
                                                }

                                                var21 = var76;
                                                var23 = var21 + 1L;
                                                var23 = var21 * var23;
                                                long var25 = var21 + 2L;
                                                var23 *= var25;
                                                var21 += 3L;
                                                var23 *= var21;
                                                var21 = var23 & 7L;
                                                long var466;
                                                var34 = (var466 = var21 - 0L) == 0L ? 0 : (var466 < 0L ? -1 : 1);
                                                if (var34 == 0) {
                                                    var76 <<= 19;
                                                    var76 ^= -992686603;
                                                    var58 = var76 + 1;
                                                    var58 = var76 * var58;
                                                    var58 &= 1;
                                                    if (var58 == 0) {
                                                        boolean var274 = dT.F(var287, "seek", false);
                                                        FX var63 = new FX(var59, "", var320, var10, var334, var337, var14, var16, var298, var379, var274);
                                                        return new AC(var63, null, var406);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break label342;
            }

            RuntimeException var33 = (RuntimeException)var8;
            IOException var296 = new IOException("unreadable media session line", var33);
            throw var296;
        }

        RuntimeException var44 = new RuntimeException();
        throw var44;
    }

    public static String FM(String var0) {
        String var191 = null;
        label199: {
            int var111;
            String var138;
            label210: {
                var111 = tr;
                var111 ^= -2024831309;
                int var2 = System.identityHashCode(var0);
                int var4 = var0.lastIndexOf(33);
                long var5 = var2;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var245;
                int var155 = (var245 = var5 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                label196:
                if (var155 == 0) {
                    var111 *= 1641428067;
                    var111 &= -1889918939;
                    var111 |= 1898588742;
                    var111 -= 934784131;
                    var111 ^= -2018690919;
                    var5 = var111;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var246;
                    int var158 = (var246 = var5 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                    if (var158 != 0) {
                        break label199;
                    }

                    String var145;
                    if (var4 >= 0) {
                        var111 += 1899440736;
                        var111 &= -124243992;
                        var111 &= -1578522498;
                        var111 -= -484844521;
                        var111 ^= 68475282;
                        var5 = var111;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var247;
                        int var162 = (var247 = var5 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                        if (var162 != 0) {
                            break label199;
                        }

                        String var144 = var0.substring(++var4);
                        int var163 = var2 + 1;
                        int var164 = var2 * var163;
                        int var6 = var2 + 2;
                        int var165 = var164 * var6;
                        var6 = var2 + 3;
                        int var166 = var165 * var6;
                        int var167 = var166 & 7;
                        if (var167 != 0) {
                            var111 ^= 1719645008;
                            var111 >>>= 13;
                            var111 += 791060510;
                            var111 ^= -123959445;
                            break label196;
                        }
                        var111 = switch (var111) {
                            default -> var111 ^ -1888336243;
                            case -641334202 -> var111 ^ -848078069;
                            case 955422083 -> {
                                var111 <<= 29;
                                var111 -= 2100239858;
                                yield var111 ^ 1464581807;
                            }
                        };
                        var5 = var111;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var248;
                        int var171 = (var248 = var5 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                        if (var171 != 0) {
                            break label199;
                        }

                        var145 = var144;
                        var111 += 588533309;
                        var111 &= -985400279;
                        var111 ^= -1084127244;
                        var111 ^= 604137818;
                    } else {
                        var111 -= -1230852071;
                        var111 ^= 312050513;
                        var5 = var111;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var249;
                        int var174 = (var249 = var5 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                        if (var174 != 0) {
                            break label199;
                        }

                        var145 = var0;
                        var111 |= -64493909;
                        var111 ^= 728544176;
                        var111 ^= -1880423511;
                    }

                    var5 = var111;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var250;
                    int var3 = (var250 = var5 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        break label199;
                    }

                    int var134 = var145.lastIndexOf(46);
                    int var177 = var2 + 1;
                    int var178 = var2 * var177;
                    int var194 = var2 + 2;
                    int var179 = var178 * var194;
                    var194 = var2 + 3;
                    int var180 = var179 * var194;
                    int var181 = var180 & 7;
                    if (var181 != 0) {
                        var111 ^= 238435353;
                        var111 ^= -2099025581;
                    } else {
                        label223: {
                            var111 += -90451075;
                            var111 &= -411054309;
                            var111 -= -1288017705;
                            var111 >>= 29;
                            var111 ^= 1744148272;
                            int var182 = var111 + 1;
                            int var183 = var111 * var182;
                            int var184 = var183 & 1;
                            if (var184 != 0) {
                                break label199;
                            }

                            label203: {
                                if (var134 > 0) {
                                    var111 = switch (var111) {
                                        case -1744148276 -> {
                                            var111 ^= 483460850;
                                            var111 *= -1043183713;
                                            yield var111 ^ 1325952502;
                                        }
                                        case -1048322724 -> var111 ^ 950764943;
                                        default -> var111 ^ 1188290406;
                                    };
                                    String var185 = var145.substring(var134);
                                    boolean var186 = var185.equalsIgnoreCase(".exe");
                                    var194 = var2 + 1;
                                    var194 = var2 * var194;
                                    var194 &= 1;
                                    if (var194 != 0) {
                                        var111 >>= 15;
                                        var111 += -1042785818;
                                        var111 *= 2071482023;
                                        var111 |= -1923138128;
                                        var111 ^= 709536797;
                                        break label223;
                                    }
                                    var111 = switch (var111) {
                                        case -1011824780 -> {
                                            var111 &= -1255303709;
                                            var111 *= 1564147195;
                                            var111 *= 1311452707;
                                            var111 &= -161388357;
                                            yield var111 ^ -191042317;
                                        }
                                        case -441679117 -> var111 ^ 2062563954;
                                        default -> var111 ^ -238026023;
                                    };
                                    if (var186) {
                                        var111 += -1225660730;
                                        var111 *= 1191892469;
                                        var111 ^= 227371770;
                                        int var187 = var111 + 1;
                                        int var188 = var111 * var187;
                                        int var189 = var188 & 1;
                                        if (var189 != 0) {
                                            break label199;
                                        }

                                        String var190 = var145.substring(0, var134);
                                        Integer var199 = var2;
                                        if (var199 == null) {
                                            var111 &= -1853487221;
                                            var111 <<= 18;
                                            var111 += 247203064;
                                            var111 ^= -142797036;
                                            break label223;
                                        }

                                        var111 &= -1949324601;
                                        var111 ^= -1062573165;
                                        var191 = var190;
                                        switch (var111) {
                                            case -997819043:
                                                var111 ^= -57544288;
                                                break label203;
                                            case 1005709550:
                                            default:
                                                var111 ^= 1154522812;
                                                break label203;
                                            case 1257032468:
                                                var111 >>>= 31;
                                                var111 -= 728098054;
                                                var111 ^= 1330978312;
                                                break label203;
                                        }
                                    }

                                    var111 *= -1238816933;
                                    var111 -= -466340560;
                                    var111 &= -616561017;
                                    var111 ^= 1223057077;
                                    var111 ^= 1936117693;
                                } else {
                                    var111 ^= -1708890698;
                                    var111 += 1137209008;
                                    var111 += -734718899;
                                    var111 |= -1768364985;
                                    var111 ^= 930833406;
                                }

                                var194 = var111 + 1;
                                var194 = var111 * var194;
                                int var237 = var111 + 2;
                                var194 *= var237;
                                int var238 = var111 + 3;
                                var194 *= var238;
                                var194 &= 7;
                                if (var194 != 0) {
                                    break label199;
                                }

                                if (var134 >= 0) {
                                    var111 ^= -1237146621;
                                    var111 &= 1151900423;
                                    var111 ^= 2066460708;
                                    var194 = var111 + 1;
                                    var194 = var111 * var194;
                                    int var239 = var111 + 2;
                                    var194 *= var239;
                                    int var240 = var111 + 3;
                                    var194 *= var240;
                                    var194 &= 7;
                                    if (var194 != 0) {
                                        break label199;
                                    }

                                    var138 = var145.substring(++var134);
                                    Integer var210 = var2;
                                    if (var210 == null) {
                                        var111 |= 1029493226;
                                        var111 ^= -1471487998;
                                        break label223;
                                    }

                                    var111 *= 1113812269;
                                    var111 -= 180323450;
                                    var111 ^= -1269763379;
                                    var111 -= 454321965;
                                    var111 ^= 1528984212;
                                    var210 = var111;
                                    if (var210 == null) {
                                        break label199;
                                    }

                                    var191 = var138;
                                    var111 += -1677302574;
                                    var111 += -294846121;
                                    var111 *= -744119081;
                                    var111 ^= 584092325;
                                } else {
                                    var111 = switch (var111) {
                                        case -1446996087 -> {
                                            var111 ^= -488593083;
                                            var111 += 2059598481;
                                            yield var111 ^ 176025930;
                                        }
                                        default -> var111 ^ -1105960878;
                                        case 462972143 -> var111 ^ 1429472066;
                                    };
                                    var191 = var145;
                                    var111 ^= 2061138035;
                                    var111 -= -1262693006;
                                    var111 *= 241883447;
                                    var111 ^= -1305202932;
                                }
                            }

                            boolean var137 = var191.isEmpty();
                            Integer var146 = var2;
                            if (var146 != null) {
                                var111 -= -1511802264;
                                var111 -= -1681828465;
                                var111 ^= -1137022526;
                                var146 = var111;
                                if (var146 == null) {
                                    break label199;
                                }

                                if (var137) {
                                    var111 &= 1382620306;
                                    var111 |= -593465070;
                                    var111 ^= -547058450;
                                    long var139 = var111;
                                    long var214 = var139 + 1L;
                                    long var215 = var139 * var214;
                                    long var140 = var215 & 1L;
                                    long var251;
                                    int var141 = (var251 = var140 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                                    if (var141 != 0) {
                                        break label199;
                                    }

                                    var138 = "Media";
                                    var111 -= 1375265134;
                                    var111 |= -192986190;
                                    var111 ^= -1959053094;
                                    break label210;
                                }

                                var111 *= 908489753;
                                var111 ^= -14320759;
                                char var148 = var191.charAt(0);
                                char var149 = Character.toUpperCase(var148);
                                String var192 = var191.substring(1);
                                long var212 = var2;
                                long var8 = var212 + 1L;
                                var8 = var212 * var8;
                                long var213 = var8 & 1L;
                                long var252;
                                var2 = (var252 = var213 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                                if (var2 == 0) {
                                    var111 = switch (var111) {
                                        case -2005806599 -> var111 ^ 463431880;
                                        case 1220236568 -> {
                                            var111 += 1716017831;
                                            var111 ^= -1865951308;
                                            var111 >>>= 30;
                                            var111 -= -1878539444;
                                            yield var111 ^ 431269180;
                                        }
                                        default -> var111 ^ 1660692201;
                                    };
                                    var2 = var111 + 1;
                                    var2 = var111 * var2;
                                    var2 &= 1;
                                    if (var2 != 0) {
                                        break label199;
                                    }

                                    String var128 = var149 + var192;
                                    var138 = var128;
                                    var111 ^= 508296210;
                                    var111 ^= 482545406;
                                    break label210;
                                }

                                switch (var111) {
                                    case -1491387312:
                                        var111 ^= -1195730964;
                                        break;
                                    case 1220236568:
                                        var111 -= -1822199772;
                                        var111 += -724664022;
                                        var111 += -274715411;
                                        var111 += 811672883;
                                        var111 ^= 2106764242;
                                        break;
                                    case 1897105702:
                                    default:
                                        var111 ^= -1001113088;
                                }
                            } else {
                                switch (var111) {
                                    case -1680931598:
                                        var111 *= 616537323;
                                        var111 *= 490950131;
                                        var111 ^= -1257280514;
                                        break;
                                    case -442697531:
                                    default:
                                        var111 ^= -1541190883;
                                        break;
                                    case 777436326:
                                        var111 ^= -94039147;
                                }
                            }
                        }
                    }
                } else {
                    switch (var111) {
                        case -1194456693:
                        default:
                            var111 ^= 145758220;
                            break;
                        case 740597241:
                            var111 ^= 2077833247;
                            break;
                        case 2032481229:
                            var111 >>= 11;
                            var111 ^= -406806996;
                            var111 &= -162197684;
                            var111 |= 2000381583;
                            var111 ^= 550141283;
                    }
                }

                var2 = var111 + 1;
                var2 = var111 * var2;
                int var142 = var111 + 2;
                var2 *= var142;
                var111 += 3;
                var2 *= var111;
                var111 = var2 & 7;
                if (var111 == 0) {
                    IllegalStateException var122 = new IllegalStateException();
                    throw var122;
                }
                break label199;
            }

            long var150 = var111;
            long var216 = var150 + 1L;
            var216 = var150 * var216;
            long var242 = var150 + 2L;
            var216 *= var242;
            var150 += 3L;
            var216 *= var150;
            var150 = var216 & 7L;
            long var253;
            int var129 = (var253 = var150 - 0L) == 0L ? 0 : (var253 < 0L ? -1 : 1);
            if (var129 == 0) {
                return var138;
            }
        }

        IllegalStateException var123 = new IllegalStateException();
        throw var123;
    }

    private static String j(String var0, int var1) {
        label61: {
            int var24;
            String var44;
            label60: {
                int var3 = System.identityHashCode(var0);
                boolean var4 = var0.isEmpty();
                Integer var5 = var3;
                if (var5 != null) {
                    var24 = var1 ^ 1056847430;
                    var24 ^= -1701857211;
                    long var49 = var24;
                    long var7 = var49 + 1L;
                    var7 = var49 * var7;
                    long var9 = var49 + 2L;
                    var7 *= var9;
                    long var50 = var49 + 3L;
                    var7 *= var50;
                    long var51 = var7 & 7L;
                    long var72;
                    int var52 = (var72 = var51 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                    if (var52 != 0) {
                        break label61;
                    }

                    if (var4) {
                        var24 &= -1033023945;
                        var24 += -1928597709;
                        var24 ^= -955946087;
                        long var45 = var24;
                        long var66 = var45 + 1L;
                        var66 = var45 * var66;
                        long var46 = var66 & 1L;
                        long var73;
                        int var47 = (var73 = var46 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                        if (var47 != 0) {
                            break label61;
                        }

                        var44 = "";
                        switch (var24) {
                            case -1976462673:
                                var24 *= -1638261565;
                                var24 ^= -434496223;
                                break label60;
                            case -547669818:
                                var24 ^= -316390331;
                                break label60;
                            case 852430420:
                            default:
                                var24 ^= -512389891;
                                break label60;
                        }
                    }

                    var24 &= -977466052;
                    var24 &= 174591756;
                    var24 ^= -307812493;
                    var52 = var24 + 1;
                    var52 = var24 * var52;
                    int var6 = var24 + 2;
                    var52 *= var6;
                    var6 = var24 + 3;
                    var52 *= var6;
                    var52 &= 7;
                    if (var52 != 0) {
                        break label61;
                    }

                    Stream var58 = var0.lines();
                    BinaryOperator var63 = (var0x, var1x) -> {
                        int var2x = System.identityHashCode(var0x);
                        return var1x;
                    };
                    Optional var59 = var58.reduce(var63);
                    Object var60 = var59.orElse("");
                    String var61 = (String)var60;
                    long var64 = var3;
                    long var8 = var64 + 1L;
                    var8 = var64 * var8;
                    long var65 = var8 & 1L;
                    long var74;
                    var3 = (var74 = var65 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var24 -= 1153687901;
                        var24 += -463196547;
                        var24 *= -1074940623;
                        var24 ^= 1558113116;
                        String var38 = ": " + var61;
                        var44 = var38;
                        switch (var24) {
                            case -962646913:
                                var24 *= 1301901965;
                                var24 *= 1813610047;
                                var24 *= 1627815371;
                                var24 ^= 2081964003;
                                break label60;
                            case 731362410:
                            default:
                                var24 ^= -216913137;
                                break label60;
                            case 1619416136:
                                var24 ^= 1812811015;
                                break label60;
                        }
                    }

                    switch (var24) {
                        case -309383309:
                            var24 -= 854865132;
                            var24 += 1381288177;
                            var24 |= 358225730;
                            var24 *= 1939366215;
                            var24 ^= -1989498001;
                            break;
                        case 1313050262:
                        default:
                            var24 ^= 450014912;
                            break;
                        case 1954941342:
                            var24 ^= -1165943087;
                    }
                } else {
                    var24 = var1 - 943088484;
                    var24 ^= -1192196251;
                }

                var3 = var24 + 1;
                var3 = var24 * var3;
                int var48 = var24 + 2;
                var3 *= var48;
                var24 += 3;
                var3 *= var24;
                var24 = var3 & 7;
                if (var24 == 0) {
                    IllegalStateException var36 = new IllegalStateException();
                    throw var36;
                }
                break label61;
            }

            Integer var39 = var24;
            if (var39 != null) {
                return var44;
            }
        }

        AssertionError var35 = new AssertionError();
        throw var35;
    }

    private static Throwable R(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1182355991;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        tr = var4;
    }
}

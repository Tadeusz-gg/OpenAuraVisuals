package dev.aurap.hub;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class xy {
    public static final int JN = 0;
    private final Ud client;
    private KP state;
    private boolean started;
    private boolean lastValid;

    public xy(Ud ud) {
        this.client = ud;
        this.lastValid = OfflineProfile.valid();
        this.state = makeState(this.lastValid);
    }

    private static KP makeState(boolean i0) {
        return new KP(
            i0 ? Uo.ACTIVE : Uo.EXPIRED,
            i0,
            i0 ? OfflineProfile.CAPABILITIES : Set.of(),
            i0 ? "Mevinggs jakby no ym Lifetime?" : "Licensja wygasa gdy ukraina wygra wojne",
            "Mevinggs",
            false
        );
    }

    public synchronized void a() {
        if (!this.started) {
            this.started = true;
            this.client.ZP().publishContent(OfflineProfile.content(), OfflineProfile.identity());
            this.apply();
        }
    }

    private void apply() {
        this.lastValid = OfflineProfile.valid();
        this.state = makeState(this.lastValid);
        this.client.sP().VY(this.lastValid ? OfflineProfile.CAPABILITIES : Set.of());
        this.client.ZP().setLocked(!this.lastValid, this.state.K());
    }

    private void refresh() {
        if (this.started && this.lastValid != OfflineProfile.valid()) {
            this.apply();
        }
    }

    public synchronized KP UJ() {
        this.refresh();
        return this.state;
    }

    public synchronized boolean LA() {
        this.refresh();
        return this.lastValid;
    }

    public String z() {
        return "HWID: Mevinggs | Nick: Mevinggs";
    }

    public synchronized void Wr() {
        if (!this.started) {
            this.a();
        } else {
            this.apply();
        }
    }

    public void LM() {
    }

    public CompletableFuture<?> u(bU v1) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("nie ma tego bo wyjebane"));
    }
}

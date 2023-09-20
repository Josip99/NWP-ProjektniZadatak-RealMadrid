package com.realmadridinfo.ui.userauth.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/realmadridinfo/ui/userauth/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/realmadridinfo/ui/userauth/FlowMsgData;", "flow", "Lkotlinx/coroutines/flow/SharedFlow;", "getFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "userLogin", "", "email", "", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.realmadridinfo.ui.userauth.FlowMsgData> _flow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.realmadridinfo.ui.userauth.FlowMsgData> flow = null;
    
    public LoginViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.realmadridinfo.ui.userauth.FlowMsgData> getFlow() {
        return null;
    }
    
    public final void userLogin(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}
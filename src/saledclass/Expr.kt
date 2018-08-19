package saledclass


sealed class Expr {
    data class Const(val number: Double) : Expr()
    data class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}

sealed class CreateSubscriptionResult {
    class Success(val subscription: String): CreateSubscriptionResult()
    class Failure(val errors: List<String>): CreateSubscriptionResult()
    object NotFound : CreateSubscriptionResult()
}

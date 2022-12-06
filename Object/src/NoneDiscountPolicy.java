public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected Money getDiscountAmounts(Screening screening) {
        return Money.ZERO;
    }
}

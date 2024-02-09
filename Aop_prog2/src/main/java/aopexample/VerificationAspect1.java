package aopexample;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class VerificationAspect1 {
	@Pointcut("execution(*aopexample.Deposite.payment(..))|| execution(*aopexample.Withdraw.drawout(..))|| execution(*aopexample.Beneficiary.addBeneficiary(..))")
	public void targetMethods() {
		
	}
	@Before("targetMethods()")
	public void accountLogin() {
		System.out.println("Account login");
	}
	
	@After("targetMethods()")
	public void accountLogout() {
		System.out.println("Account logout");
	}	
}

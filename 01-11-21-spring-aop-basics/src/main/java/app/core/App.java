package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.company.dao.Company;
import app.core.company.dao.CompanyDao;
import app.core.coupon.dao.CouponDao;
import app.core.coupon.dao.CouponUtil;

public class App {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			System.out.println(companyDao.getClass());

			CouponDao couponDao = ctx.getBean(CouponDao.class);
			CouponUtil couponUtil = ctx.getBean(CouponUtil.class);

			companyDao.addCompany(new Company());
			companyDao.sayHello();

			couponDao.addCoupon();
			couponDao.doWork(3);

			System.out.println(couponUtil.getInt());

		}

	}

}

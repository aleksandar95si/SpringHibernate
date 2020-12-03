package fon.nst.springhibernate.config;

import org.springframework.context.annotation.ComponentScan;



@ComponentScan(basePackages = {
		"fon.nst.springhibernate.main",
		"fon.nst.springhibernate.repository",
		"fon.nst.springhibernate.service.impl"
})
public class Config {

}

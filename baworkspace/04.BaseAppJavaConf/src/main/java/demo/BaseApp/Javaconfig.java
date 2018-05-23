package demo.BaseApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import demo.beans.Customer;
import demo.repo.WalletRepo;
import demo.repo.WalletRepoClass;
import demo.service.WalletServiceClass;
@Configuration
@ComponentScan
public class Javaconfig {

@Bean(value="map")
public Map<String, Customer> getMap()
{
	return new HashMap<String, Customer>();
}
@Bean(value="repo")
public WalletRepoClass getRepo()
{
  return new WalletRepoClass(getMap());

}
@Bean(value="service")
public WalletServiceClass WalletServiceClass()
{
	return new WalletServiceClass(getRepo());
}

}


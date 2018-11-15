package co.udea.regact.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class RegistroActividadesApiApplication extends SpringBootServletInitializer {	
	public static void main(String[] args) {
		SpringApplication.run(RegistroActividadesApiApplication.class, args);
	}
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	return application.sources(appClass);
    }
    
    private static Class<RegistroActividadesApiApplication> appClass = RegistroActividadesApiApplication.class;
}

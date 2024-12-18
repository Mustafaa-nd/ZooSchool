package sn.diamniadio.polytech.ZooSchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import sn.diamniadio.polytech.ZooSchool.Lion;

import javax.xml.transform.Result;
import java.util.Arrays;

@SpringBootApplication
//@EnableWebMvc
public class ZooSchoolApplication {


	public static void main(String[] args) {
		SpringApplication.run(ZooSchoolApplication.class, args);

		Lion Mufasa = new Lion(1,"Mufasa");


	}

//	@Override
//	public void run(String... args) throws Exception{
//		System.out.println(this.lion.getNom());
//	}
}
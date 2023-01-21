package pl.pjwstk.s25670Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S25670BankApplication {
	public S25670BankApplication(TransferService transferService, ClientStorage clientStorage){

//		System.out.println(transferService.sendMoney("1", 1500));
//		System.out.println(transferService.addMoney("2", 3000));
//
//		System.out.println(transferService.sendMoney("1", 50000));
//
//		clientStorage.registerClient(new Client("6","Adam",7700));
//		System.out.println(clientStorage.getClientList());
	}
	public static void main(String[] args) {
		SpringApplication.run(S25670BankApplication.class, args);
	}
}

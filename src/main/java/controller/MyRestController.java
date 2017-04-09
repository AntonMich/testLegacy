package controller;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/start/")
// @CrossOrigin(origins = "http://localhost:4200")
public class MyRestController {
	// MyString myString = new MyString("my new string message");
	private String myStroka = "";

	@CrossOrigin(origins = "*")
	@Scope("request")
	@RequestMapping(value = "/message", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getMessage() {
		Gson gson = new Gson();
		String json = gson.toJson(myStroka);
		System.out.println(json + "resp");
		return json;
	}

	@CrossOrigin(origins = "*")
	@Scope("request")
	@RequestMapping(value = "/messageme", method = RequestMethod.POST)
	public ResponseEntity<?> String(@RequestBody String request) {
		// System.out.println(myString.getStroka());
		System.out.println(request + "req");
		myStroka = reverseMyString(request);
		return new ResponseEntity<Object>(null, HttpStatus.OK);

	}

	private String reverseMyString(String stroka) {
		String stroks[] = stroka.split(":");
		if (stroks.length == 1) {
			return "null input";
		} else {
			return reverseString(stroks[1]);
		}
	}

	private String reverseString(String string) {
		String result = new StringBuffer(string).reverse().toString();
		return result.trim();

	}
}
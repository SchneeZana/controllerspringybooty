package com.firstquest.firstquest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
 public class doctorwho {
@GetMapping ("/")

public String listdoctors() {
    StringBuilder builder = new StringBuilder();
    builder.append("<ul>");
    builder.append("<li><a href='/doctor/1'>Doctor 1</a></li>");
    builder.append("<li><a href='/doctor/4' >Doctor 4</a></li>");
    builder.append("<li><a href='/doctor/10'>Doctor10</a></li>");
    builder.append("<li><a href='/doctor/13'>Doctor13</a></li>");
    builder.append("</ul>");
    return builder.toString();
}
@GetMapping("/doctor/{number}")
public String getDoctors(@PathVariable int number ) {
switch (number){
    case 1:
return "William Hartnell";
    case 4:
        return"Tom Baker";
    case 10:
return "David Tennant";
    case 13:
        return "Jodie Whittaker";
    default:
        return "Unknown Doctor";
}
}
}

/*
 * package org.humber.project.controllers;
 * 
 * import org.humber.project.services.LoginService; // Import LoginService
 * import org.springframework.beans.factory.annotation.Autowired;
 * import
 * org.springframework.security.authentication.AbstractAuthenticationToken;
 * import org.springframework.security.authentication.AuthenticationManager;
 * import org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken;
 * import org.springframework.security.core.Authentication;
 * import org.springframework.security.core.context.SecurityContextHolder;
 * import org.springframework.security.web.authentication.
 * WebAuthenticationDetailsSource;
 * import org.springframework.stereotype.Controller;
 * import org.springframework.ui.Model;
 * import org.springframework.ui.ModelMap;
 * import org.springframework.web.bind.annotation.PostMapping;
 * import org.springframework.web.bind.annotation.RequestMapping;
 * import org.springframework.web.bind.annotation.RequestMethod;
 * import org.springframework.web.bind.annotation.RequestParam;
 * import org.springframework.web.bind.annotation.SessionAttributes;
 * import org.springframework.web.context.request.RequestContextHolder;
 * import org.springframework.web.context.request.ServletRequestAttributes;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * 
 * @Controller
 * 
 * public class LoginController {
 * 
 * private final AuthenticationManager authenticationManager;
 * 
 * public LoginController(AuthenticationManager authenticationManager) {
 * this.authenticationManager = authenticationManager;
 * }
 * 
 * @PostMapping("/signin")
 * public String signin(@RequestParam String name, @RequestParam String
 * password, Model model) {
 * try {
 * // Create an authentication token with the username and password
 * UsernamePasswordAuthenticationToken authenticationToken = new
 * UsernamePasswordAuthenticationToken(name,
 * password);
 * // Authenticate the user
 * Authentication authentication =
 * authenticationManager.authenticate(authenticationToken);
 * // Set the authentication details
 * ((AbstractAuthenticationToken) authentication)
 * .setDetails(new WebAuthenticationDetailsSource().buildDetails(getRequest()));
 * // Set the authenticated user in the security context
 * SecurityContextHolder.getContext().setAuthentication(authentication);
 * // Redirect to the home page after successful login
 * return "redirect:/";
 * } catch (Exception e) {
 * // If authentication fails, display an error message
 * model.addAttribute("error", "Invalid username or password");
 * return "login";
 * }
 * }
 * 
 * // Helper method to get the HTTP servlet request
 * private HttpServletRequest getRequest() {
 * return ((ServletRequestAttributes)
 * RequestContextHolder.getRequestAttributes()).getRequest();
 * }
 * }
 */
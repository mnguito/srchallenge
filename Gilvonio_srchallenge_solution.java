
website.sendText(“myName”, “name”, “user-submitted-name”, “Lucas Ocampo”);
website.sendText(“myName”, “css”, “input[name='user-submitted-name']”, “Lucas Ocampo”);
website.sendText(“myName”, “xpath”, “//input[@name='user-submitted-name']”, “Lucas Ocampo”);

website.sendText(“email_address”, “name”, “user-submitted-email”, “lcampos@gmail.com”);
website.sendText(“email_address”, “css”, “input[name='user-submitted-email']”, “lcampos@gmail.com”);
website.sendText(“email_address”, “xpath”, “//input[@name='user-submitted-email']”, “lcampos@gmail.com”);

website.sendText(“product_title”, “name”, “user-submitted-title”, “Campos: Del campo”);
website.sendText(“product_title”, “css”, “input[name='user-submitted-title']”, “Campos: Del campo”);
website.sendText(“product_title”, “xpath”, “//input[@name='user-submitted-title']”, “Campos: Del campo”);

website.sendText(“product_url”, “name”, “user-submitted-url[]”, “http://camposl.com.pe”);
website.sendText(“product_url”, “css”, “input[name='user-submitted-url[]']”, “http://camposl.com.pe”);
website.sendText(“product_url”, “xpath”, “//input[@name='user-submitted-url[]']”, “http://camposl.com.pe”);

website.sendText(“product_describe”, “name”, “user-submitted-content”, “Descripcion de los productos del Campo”);
website.sendText(“product_describe”, “css”, “textarea[name='user-submitted-content']”, “Descripcion de los productos del Campo”);
website.sendText(“product_describe”, “xpath”, “//textarea[@name='user-submitted-content']”, “Descripcion de los productos del Campo”);

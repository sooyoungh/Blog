# Blog

<aside>
  
    📝 Web Architecture를 공부하기 위해 구현한 블로그(게시판) 프로젝트

</aside>

  1. [JSP + Servlet](#ver1-jsp--servlet)
  2. [JSP + Spring MVC](#ver2-jsp--spring-mvc)
  3. [Front + Back(Spring Boot)](#ver3-front--backspring-boot)


## ver1. JSP + Servlet

![image](https://user-images.githubusercontent.com/77563814/191008015-aa4aa778-db29-4446-b2e1-84c033afc29f.png)
- Jsp (View)
- Servlet (Controller)
- JavaBeans (Model)

> 동작 과정
> 
>     1. 서블릿(Controller)이 요청을 받는다. 
>     2. 자바 빈(Model)이 비즈니스 로직 처리 후, 뷰(jsp)에 반환한다. 
>     3. 뷰(jsp)는 결과를 전달받아 최종 화면을 출력한다.


## ver2. JSP + Spring MVC
![image](https://user-images.githubusercontent.com/77563814/191040036-9f5dac4f-322a-46e5-906a-cc54debd93ee.png)
- Jsp (View)
- Spring Framework (Controller + Model)
    - Controller
    - Service
    - Dao

> 동작 과정
> 
>     1. 모든 요청은 Front Controller(Dispatcher-Servlet)이 받아서 해당하는 Controller를 찾는다. 
>     2. 해당 요청에 따른 비즈니스 로직 처리 후 Front Controller에 반환한다.
>     3. 해당하는 뷰(jsp)를 찾아 Front Controller에 반환, 최종 출력한다.



## ver3. Front + Back(Spring Boot)
![image](https://user-images.githubusercontent.com/77563814/191008041-991b8d92-a3b1-48e0-b686-6869213c6358.png)
- Front : Html, Css, Javascript
- Back : Spring Boot

> 동작 과정
> 
>     1. 프론트에서 요청을 받으면 Ajax 통신으로 백에 전달한다. 
>     2. 백에서 Controller-Service-Repository 계층 각각에 맞게 로직 처리하고 결과를 프론트에 반환한다.
>     3. 프론트에서 해당 결과를 토대로 뷰(Html)를 출력한다.


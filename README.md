# spring-boot_jpaExample
這幾個月自行學習，整理出來的架構，jpa使用方法的乾淨版


環境版本<br/>
java-1.8.0_144<br/>
tomcat-7.0.81<br/>
maven-3.5.0<br/>

產生jar檔，並放入tomcat底下運行<br/>
mvn clean package<br/>


測試連結為<br/>
讀取<br/>
http://localhost:8081/test/testRead<br/>
新增<br/>
http://localhost:8081/test/testAdd<br/>
修改<br/>
http://localhost:8081/test/testEdit<br/>
刪除網址get變數id<br/>
http://localhost:8081/test/testDel<br/>
Sql讀取<br/>
http://localhost:8081/test/testReadSql<br/>


資料庫相關值均在TestConttroller裡面

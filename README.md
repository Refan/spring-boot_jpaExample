# spring-boot_jpaExample
這幾個月自行學習，整理出來的架構，jpa使用方法的乾淨版


環境版本
java version "1.8.0_144"
tomcat-7.0.81
maven-3.5.0


產生jar檔，並放入tomcat底下運行
mvn clean package


測試連結為
讀取
http://localhost:8081/test/testRead
新增
http://localhost:8081/test/testAdd
修改
http://localhost:8081/test/testEdit
刪除網址get變數id
http://localhost:8081/test/testDel
Sql讀取
http://localhost:8081/test/testReadSql


資料庫相關值均在TestConttroller裡面

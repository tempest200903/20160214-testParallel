## 成功例1 ##

- pom.xml

    > <plugins>
    >      <plugin>
    >       <artifactId>maven-surefire-plugin</artifactId>
    >       <version>2.19</version>
    >       <dependencies>
    >        <dependency>
    >         <groupId>org.apache.maven.surefire</groupId>
    >         <artifactId>surefire-junit47</artifactId>
    >         <version>2.18.1</version>
    >        </dependency>
    >       </dependencies>
    >       <configuration>
    >        <reuseForks>false</reuseForks>
    >        <forkCount>2.5C</forkCount>
    >       </configuration>
    >      </plugin>
    >     </plugins>

- mvn test 実行結果

    > -------------------------------------------------------
    >  T E S T S
    > -------------------------------------------------------
    > Running com.example.sourceDirectory.A1Test
    > [788937] begin A1Test.test3
    > Running com.example.sourceDirectory.A2Test
    > [788974] begin A2Test.test1
    > [789937] end   A1Test.test3
    > [789942] begin A1Test.test2
    > [789975] end   A2Test.test1
    > [789981] begin A2Test.test2
    > [790942] end   A1Test.test2
    > [790943] begin A1Test.test4
    > [790981] end   A2Test.test2
    > [790982] begin A2Test.test3
    > [791943] end   A1Test.test4
    > [791946] begin A1Test.test1
    > [791982] end   A2Test.test3
    > [791984] begin A2Test.test4
    > [792946] end   A1Test.test1
    > Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.009 sec - in com.example.sourceDirectory.A1Test
    > [792984] end   A2Test.test4
    > Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.026 sec - in com.example.sourceDirectory.A2Test
    > 
    > Results :
    > 
    > Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
 

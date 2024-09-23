package com.ohgiraffes.section04.dto;

import java.time.LocalDateTime;

public class UserDTO {

    /*학습목표 앞으로 사용할 DTO 클래스의 규칙과 틀에 대해 이해할 수 있다.*/

    /*필기
    * 1. 모든 필드는 private 으로 캡슐화를 적용하여 작성해야 한다.
    * 2. 기본 생성자는 명시적으로 존재해야 한다.
    * 3. 매개변수가 있는 생성자는 선택사항이다.
    * 4. 모든 필드에 접근할 수 있는 setter 와 getter 는 public 으로 작성해야 한다.
    *  */

    /*목차 1. 필드 작성 */
    private String id;
    private String pwd;
    private String name;
    private LocalDateTime enrollData;


    /*목차 2. 기본 생성자 작성 */
    public UserDTO(){}


    /*목차 3. 매개변수가 있는 생성자는 선택이다.
             하지만 모든 필드를 초기화 하는 생성자를 만드는 경우가 많다 */

    //art+Inset


    public UserDTO(String id, String pwd, String name, LocalDateTime enrollData) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollData = enrollData;

    }



    /*목차 4. private */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEnrollData() {
        return enrollData;
    }

    public void setEnrollData(LocalDateTime enrollData) {
        this.enrollData = enrollData;
    }


    /*목차 5. toString() 매소드 오버라이딩*/
    /*필기
    접근자로 값을 출력하는 구문이 번거롭기 때문에
    모든 필드의 값을 하나의 문자열로 반환 해주는 메소드*/

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollData=" + enrollData +
                '}';
    }
}




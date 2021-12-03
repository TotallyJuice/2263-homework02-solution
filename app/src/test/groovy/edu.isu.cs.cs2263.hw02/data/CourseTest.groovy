package edu.isu.cs.cs2263.hw02.data

import spock.lang.Specification

class CourseTest extends Specification{

    Course course

    def setup(){
        course = new Course("Test Class", "CS", 100, 3);
    }

    def 'test name getter'(){
        expect:
        course.getName() == "Test Class"
    }

    def 'test name setter' (){
        when:
        course.setName("Another Class")

        then:
        course.getName() == "Another Class"
    }

    def 'test number getter'(){
        expect:
        course.getNumber() == 100
    }

    def 'test number setter'(){
        when:
        course.setNumber(202)

        then:
        course.getNumber() == 202
    }

    def 'test credits getter'(){
        expect:
        course.getCredits() == 3
    }

    def 'test credits setter'() {
        when:
        course.setCredits(4)

        then:
        course.getCredits() == 4
    }

    def 'test code getter'(){
        expect:
        course.getCode() == "CS"
    }

    def 'test code setter'(){
        when:
        course.setCode("MATH")

        then:
        course.getCode() == "MATH";
    }

    def 'test course to string'(){
        expect:
        course.toString() == "CS 100 Test Class (3)"
    }

}

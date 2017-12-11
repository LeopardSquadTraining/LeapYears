package leopard.squad.training

import spock.lang.Specification

class LeapYearTest extends Specification {

    def "is_a_leap_year( 1996 ).is( true )"() {

        given:
          def leapYear = new LeapYear()

        when:
         def result = leapYear.isALeapYear(1996)

        then:
          result == true
    }

    def "is_a_leap_year( 2001 ).is( false )"() {

        given:
          def leapYear = new LeapYear()

        when:
          def result = leapYear.isALeapYear(2001)

        then:
          result == false
    }

    def "is_a_leap_year( 2000 ).is( true )"() {

        given:
          def leapYear = new LeapYear()

        when:
          def result = leapYear.isALeapYear(2000)

        then:
          result == true
    }

    def "is_a_leap_year( 1900 ).is( false )"() {

        given:
          def leapYear = new LeapYear()

        when:
          def result = leapYear.isALeapYear(1900)

        then:
          result == false
    }

}

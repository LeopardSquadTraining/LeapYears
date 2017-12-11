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

    def "test leap year functionality with an array or years"() {

        when:
          def leapYear = new LeapYear()
          def years = [2004, 2008, 2080, 2092, 1904, 1972, 1904, 1964, 1952]
          def result = null

        then:
          for(def year: years){
              //println('Testing' + year + ' is a leap year.')
              result = leapYear.isALeapYear(year)
              result == true
          }
    }

}

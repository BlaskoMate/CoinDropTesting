Feature: Browse a cause

    Scenario Outline: Browse a cause

        Given We have a cause with the <link>
        When we open the <link> page
        Then "test4" title name can be seen

        Examples:
        |   link   |
        |test4_link|
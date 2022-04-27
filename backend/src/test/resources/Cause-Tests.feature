Feature: Cause Tests

    Scenario Outline: Create a cause
        
        Given the user on the create a cause page 
        When fill the <name> ,<link>, <description>
        And upload some jpg and click on 'Submit' button
        Then open the new cause
        
        Examples:
        |    name    |     link     | description|
        |testingCause|   test_cause | "The second behavior arguably needs the first behavior to run first because the second needs to start at the search result page. However, since that is merely setup for the behavior of image searching and is not part of it, the Given step in the second scenario can basically declare (declaratively) that the “panda” search must already be done. Of course, this means that the “panda” search would be run redundantly at test time, but the separation of scenarios guarantees behavior-level independence."|



    Scenario Outline: Browse a cause

        Given We have a cause with the <link>
        When we open the <link> page
        Then "test4" title name can be seen

        Examples:
            |   link   |
            |test4_link|
# searchsuggetion


High Level Design:

search suggestion engine code to suggest changes. This application leverages java hash map. Hash Map is used maintain the mapping of all the possible strings, which can be made from the sequential substring from all the submitted stings(all substrings starts from start of submited strings), mapped with the List of all the submitted string associated with it ordered by their frequency in descending. 
At the start of execution, Application asks for number of string can be enlisted in suggestion result. After that application ask you to enter a string and then it will give you 3 options:
1. Suggestion
2. Submit
3. exit

If you choose suggest it will show you the list of Type ahead suggetion.  
On selecting the submit, it will store the string for future suggestion. 



Low level design:

Application uses SearchSuggetionEngine which store the mapping of substrings with TopMostFrequentStringList.
TopMostFrequentStringList is basically maintain the ordered list of submitted with their frequecies in the form of StringFrequency object which maintains submitted string and their frequency. It also maintains a hash map which map the submitted string with their StringFrequecy object which enables it to update the object in less time.

                                SearchSuggetionEngine: HashMap
                                
                subString1--------------------------> TopMostFrequentStringList:  HashMap : SubmitString1      SubmitString2  ......
                                                                                                |                     |
                                                                                  ArrayList: SubmitString1,freq | submitString2,freq |.........
                                
                                
                substring2--------------------------> TopMostFrequentStringList:  HashMap : SubmitString1      SubmitString2  ......
                                                                                                 |                     |
                                                                                  ArrayList: SubmitString1,freq | submitString2,freq |.........
                                   |
                                   |
                                   |
                                   |
                                   |
                               

Execution Instructions:

1. Set the JAVA_HOME variable with home directory of java jdk
2. Open cmd and got application home directory perform maven build by doing "maven clean install"
3. Go to target folder and run the application using command "java -jar searchsuggestion.jar"

                               

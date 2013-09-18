(defproject intel194 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.apache.commons/commons-lang3 "3.1"]
                 [org.codehaus.jedi/jedi-core "3.0.5"]]
  :java-source-paths ["src"]
  ;; So things like `mvn exec:java -Dexec.mainClass=intel194.Hello'
  ;; will work; deposits pom.xml in the current dir.
  :target-path ""
  :main intel194.Hello)

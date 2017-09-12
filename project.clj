(defproject neoxj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;:dependencies [[org.clojure/clojure "1.8.0"]
  ;               [org.neo4j/neo4j "3.2.0" :scope "provided"]
  ;               [org.neo4j.test/neo4j-harness "3.2.3" :scope "provided"]
  ;               [org.neo4j.driver/neo4j-java-driver "1.2.1" :scope "provided"]
  ;               [junit "4.11" :scope "provided"]]
  :main ^:skip-aot neoxj.Echo
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [org.neo4j/neo4j "3.2.0" :scope "provided"]
                                  [org.neo4j.test/neo4j-harness "3.2.3" :scope "provided"]
                                  [org.neo4j.driver/neo4j-java-driver "1.2.1" :scope "provided"]
                                  [junit "4.11" :scope "provided"]]}
             :provided {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :uberjar {:dependencies [[org.clojure/clojure "1.8.0"]]
                       :aot :all}})

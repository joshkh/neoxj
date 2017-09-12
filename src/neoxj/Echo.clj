(ns neoxj.Echo
  (:import [org.neo4j.procedure.Description]
           [org.neo4j.procedure.Name]
           [org.neo4j.procedure.UserFunction])
  (:gen-class {:name neoxj.Echo
               :methods [[^{UserFunction nil Description "Testing123"} echo [] String]]}))

(defn -echo [^{Name "value"} value]
  (str "Echo: " value))

(defn -main
  "Won't get called by Neo4j, but used for testing"
  [& args]
  (println (-echo "Ping")))
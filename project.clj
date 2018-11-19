(defproject conway "0.1.0"
  :description "Clojure implementation of Conway's game of life."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot conway.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

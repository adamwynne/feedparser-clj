(defproject adamwynne/feedparser-clj "0.5.1"
  :description "Parse RSS/Atom feeds with a simple, clojure-friendly API."
  :dependencies [[org.clojure/clojure "1.6.0"]
		 [org.jdom/jdom "2.0.2"]
		 [enlive "1.1.5"]
		 [net.java.dev.rome/rome "1.0.0"]]
  :main feedparser-clj.core)

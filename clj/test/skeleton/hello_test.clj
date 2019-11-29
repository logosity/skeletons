(ns skeleton.hello-test
  (:require
    [clojure.test :refer [deftest testing]]
    [spy.core :as spy]
    [testit.core :refer [fact]]
    [skeleton.hello :as hello]))

(deftest skeleton-is-working
         (fact "because basic tests pass"
               (hello/add 2 2) => 4)
         (fact "because basic tests fail"
               (hello/add 2 3) => 5))

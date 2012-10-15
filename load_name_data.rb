require "json"
require "net/http"

client = Net::HTTP.new("localhost", 8080)

File.open("names.txt").each_line do |name|
  client.post("/spring-data-rest-webmvc/people", JSON.dump({"name" => name.chomp}), {"Content-Type"=>"application/json"})
end

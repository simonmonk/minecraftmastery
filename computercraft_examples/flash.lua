while true do
  if (rs.getInput("right")) then
    rs.setOutput("left", true)
    sleep(0.5)
    rs.setOutput("left", false)
  end
  sleep(0.5)
end

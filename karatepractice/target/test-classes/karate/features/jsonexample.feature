Feature: json array and object feature

Scenario: json array and object testing 

* def jsonObject = 
"""
{"menu": {
  "id": "file",
  "value": "File",
  "popup": {
    "menuitem": [
      {"value": "New", "onclick": "CreateNewDoc()"},
      {"value": "Open", "onclick": "OpenDoc()"},
      {"value": "Close", "onclick": "CloseDoc()"}
    ]
  }
}
}    

"""
* print jsonObject.menu.popup.menuitem[0].value
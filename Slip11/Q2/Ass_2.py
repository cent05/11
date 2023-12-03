import pandas as pd
 
# making data frame from csv file
data = pd.read_csv("employees.csv")

# creating bool series True for NaN values
bool_series = pd.isnull(data["MANAGER_ID"])
 
# filtering data
# displayind data only with team = NaN

data[bool_series]
print (bool_series.head(30))

new_data=data.dropna(axis=0,how='any')

print(new_data.head(20))
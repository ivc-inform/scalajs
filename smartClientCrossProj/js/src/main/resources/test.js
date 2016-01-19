isc.ListGrid.create(
    {
        ID                   : "countryList",
        width                : 500,
        height               : 224,
        alternateRecordStyles: true,
        showAllRecords       : true,
        dataSource           : DataSource.create(
            {
                ID        : "countryDS",
                dataFormat: "json",
                dataURL   : "[ISOMORPHIC]/system/reference/inlineExamples/grids/data/countryData.json",
                fields    : [
                    {name: "countryCode", title: "Code"},
                    {name: "countryName", title: "Country"},
                    {name: "capital", title: "Capital"}
                ]
            }
        ),
        autoFetchData        : true
    }
)

top = @
simpleSyS = @simpleSyS
isc = @isc

simpleSyS.getGuid = -> isc.say simpleSyS.guid(); return

isc.debugTrap = (obj...) ->
	if obj? and obj.length > 0
		obj[0]
	else
		[]

isc.debugTrac = (obj...) ->
	json = isc.JSON.encode(obj, prettyPrint: true)
	console.log "obj: #{json}"
	return



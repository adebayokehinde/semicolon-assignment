function footToMeter(foot) {
	return foot * 0.305
}
function meterToFoot(meter) {
	return meter / 0.035
}

let foot = 31
let meter = 12
console.log(`${foot} foot is equal to ${footToMeter(foot)} meters.`);
console.log(`${meter} meters is equal to ${meterToFoot(meter)} feet.`);
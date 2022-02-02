"use strict";
var personage = {
    body: {
        head: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            muscle: {
                                bones: {
                                    organs: {
                                        brain: {},
                                    },
                                },
                            },
                        },
                    },
                },
            },
        },
        torso: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            bones: {
                                muscle: {
                                    backbone: {},
                                    smalloftheback: {
                                        organs: {
                                            kidney_left: {},
                                            kidney_right: {},
                                        },
                                    },
                                    rib_left: {
                                        organs: {
                                            lung_left: {},
                                            heart: {},
                                        },
                                    },
                                    rib_right: {
                                        organs: {
                                            lung_right: {},
                                            liver: {},
                                        },
                                    },
                                    collarbone_left: {},
                                    collarbone_right: {},
                                },
                                organs: {
                                    stomach: {},
                                    bowel: {},
                                },
                            },
                        },
                    },
                },
            },
        },
        tummy: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            muscle: {
                                bones: {},
                                organs: {
                                    stomach: {},
                                    bowel: {},
                                },
                            },
                        },
                    },
                },
            },
        },
        hand_left: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            muscle: {
                                bones: {
                                    brachial: {},
                                    elbow: {},
                                    wrist: {},
                                    thumb: {},
                                    forefinger: {},
                                    middlefinger: {},
                                    ringfinger: {},
                                    littlefinger: {},
                                },
                            },
                        },
                    },
                },
            },
        },
        hand_right: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            muscle: {
                                bones: {
                                    brachial: {},
                                    elbow: {},
                                    wrist: {},
                                    thumb: {},
                                    forefinger: {},
                                    middlefinger: {},
                                    ringfinger: {},
                                    littlefinger: {},
                                },
                            },
                        },
                    },
                },
            },
        },
        groin: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            muscle: {
                                bones: {
                                    hipbone: {},
                                },
                                organs: {
                                    bladder: {},
                                    genitals: {},
                                },
                            },
                        },
                    },
                },
            },
        },
        leg_left: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            muscle: {
                                bones: {
                                    femur: {},
                                    knee: {},
                                    shin: {},
                                    foot: {},
                                    heel: {},
                                    big_toe: {},
                                    forefinger_toe: {},
                                    middle_toe: {},
                                    ring_toe: {},
                                    pinky_toe: {},
                                },
                            },
                        },
                    },
                },
            },
        },
        leg_right: {
            clothes: {
                hair: {
                    skin: {
                        blood: {
                            muscle: {
                                bones: {
                                    femur: {},
                                    knee: {},
                                    shin: {},
                                    foot: {},
                                    heel: {},
                                    big_toe: {},
                                    forefinger_toe: {},
                                    middle_toe: {},
                                    ring_toe: {},
                                    pinky_toe: {},
                                },
                            },
                        },
                    },
                },
            },
        },
    },
    survival: {
        thirst: {},
        hungry: {},
        sleepy: {},
        emptying: {},
        body_hygiene: {},
        clothes_hygiene: {},
        thermoregulation: {},
        reproduction: {},
        safety: {},
    },
    template: {
        hair: {
            density: {},
            block: {},
            resistance: {},
            transparency: {},
            colour: {},
            shine: {},
            smell: {},
            sound: {},
        },
        skin: {
            density: {},
            block: {},
            resistance: {},
            transparency: {},
            colour: {},
            shine: {},
            smell: {},
            sound: {},
        },
        blood: {
            density: {},
            block: {},
            resistance: {},
            transparency: {},
            colour: {},
            shine: {},
            smell: {},
            sound: {},
        },
        bones: {
            density: {},
            block: {},
            resistance: {},
            transparency: {},
            colour: {},
            shine: {},
            smell: {},
            sound: {},
        },
        muscle: {
            density: {},
            block: {},
            resistance: {},
            transparency: {},
            colour: {},
            shine: {},
            smell: {},
            sound: {},
        },
        organs: {
            density: {},
            block: {},
            resistance: {},
            transparency: {},
            colour: {},
            shine: {},
            smell: {},
            sound: {},
        },
    },
};
var obj = {
    name: "object",
    type: "object",
    props: {
        prop1: "123",
        prop2: "abc2",
        prop3: {
            type: "object3",
            prop4: "abc4",
        },
    },
};
var eachobject = function (obj) {
    for (var key in obj) {
        if (typeof obj[key] === "object") {
            eachobject(obj[key]);
        }
        else {
            console.log(key + " = " + obj[key]);
        }
    }
};
eachobject(obj);
console.log("hi");

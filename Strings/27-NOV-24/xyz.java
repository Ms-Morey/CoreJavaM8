// import logo from './logo.svg';
// import './App.css';
// Function App()
// {
// 	return(
// 	<div className = "App">
// 	<h1> hii welcoe to my first react app !!! </h1>
// 	</div>
// 	);
// }

// export default App;


// import React, {Component} from 'react';
// import {Platform, StyleSheet, Text, View} from 'react-native';
// type Props = {};
// export default class App extends Component<Props>
// {
// 	render(){
// 		return (
// 			<View>
// 			<Text>Hello world </Text>
// 			</View>
// 		);
// 	}
// }



public static class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener 
{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) 
    {
        // Use the current time as the default values for the picker.
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it.
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) 
    {
        // Do something with the time the user picks.
    }
}
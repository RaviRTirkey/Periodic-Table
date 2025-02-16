#Overview

The Periodic Table app is an interactive Android application that allows users to explore the periodic table of elements. The app displays a grid of element cards, each representing a chemical element with basic information (atomic number, symbol, and name). Tapping on any element card navigates the user to a detailed view with additional information such as atomic mass, period, group, block, and radioactivity status.



#Features!

##Interactive Periodic Table Grid:

###Dynamic Grid Layout: The main screen displays a scrollable grid representing the periodic table. Each cell in the grid is either a visible element card or a blank placeholder used to maintain the proper table structure.
###Color Coding: Each element card is color-coded according to its category (e.g., alkali metals, noble gases, transition metals, etc.), making it easier to visually distinguish between different types of elements.


##Element Details View:

###Detailed Information: Upon selecting an element, users are presented with a detailed view that includes the element’s atomic number, symbol, name, atomic weight, period, group, block, and radioactivity status.

###Consistent Styling: The detailed view adapts the element's category color for its UI elements, ensuring a consistent and visually appealing design.


##Navigation:

###Smooth Transitions: The app uses Android’s Navigation Component to manage transitions between the periodic table grid and the detailed view.

###Back Navigation: Users can easily navigate back to the periodic table grid using the system’s back button.

##Responsive and Adaptive Design: 

###Scrollable Views: Both horizontal and vertical scrolling are enabled to accommodate the full layout of the periodic table on various screen sizes.



#Usage Instructions

##Launching the App:

  ###Start Screen:
  
  Upon launching the app, the user is presented with the periodic table grid. The grid is displayed within a scrollable container to allow both horizontal and vertical navigation.
  
  
  ###Visual Layout:
  
  Each element is represented by a card that displays the atomic number, chemical symbol, and element name. Blank spaces (invisible cards) are used to correctly format the periodic table layout.

#Interacting with the Periodic Table:

  ##Scrolling: The user can scroll horizontally and vertically to view the entire periodic table. This ensures accessibility on devices with different screen sizes.
  
  ##Selecting an Element: Tapping on an element card that displays a valid element (i.e., non-blank) triggers a navigation.
  
  ##events:
    ###Action: The app navigates to the Element Details screen.
    ###Data Transfer: The selected element’s data is passed to the details screen.

#**Viewing Element Details**

##Viewing Element Details:

  ###The Element Details screen displays:
  The atomic number, symbol, and name in a prominent header.
  Additional details such as atomic weight, period, group, block, and radioactivity status.
  The element’s category color is used to style parts of the UI, providing a consistent visual theme.

###Navigation Back:
  Users can return to the periodic table grid using the device's back button.


















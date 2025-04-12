feat: Introduce Department Information to Student Login Details

This commit enhances the student login details functionality by adding specific information related to the student's department. The goal is to allow the system to associate each student with their respective academic department.

The following new fields have been added to the student entity:

- `departmentId`: A unique numerical identifier for the department (e.g., 101, 205). This is a private Long to ensure data integrity and efficient database querying.
- `departmentName`: The full name of the department (e.g., Computer Science, Electrical Engineering). This is a private String to store the textual representation of the department's name.
- `departmentAddress`: The physical address or location of the department (e.g., Main Building, Room 302). This is a private String to store the department's address.
- `departmentCode`: A short, often abbreviated code for the department (e.g., CS, EE, MECH). This is a private String for a concise representation of the department.

These fields will be used for various purposes, including:

- Displaying the student's department on their profile.
- Filtering and reporting students based on their department.
- Potentially integrating with department-specific functionalities in the future.

By including these details now, we lay the groundwork for a more comprehensive and informative student management system.


Why this is better for newcomers:

Clear Title: feat: Introduce Department Information to Student Login Details clearly states the purpose.
Contextual Introduction: Explains the "why" behind the change – associating students with departments.
Explicit Field Descriptions: Each field is listed with:
Its exact name as in the code (departmentId).
A brief explanation of what it represents (e.g., "unique numerical identifier").
Its data type and visibility modifier (private Long, private String) to provide technical context for developers.
Purpose and Usage: Clearly outlines how these new fields will be used within the system. This helps newcomers understand the value and impact of these changes.
Future Implications: Briefly mentions potential future integrations, giving a broader perspective.
Well-Structured Formatting: Uses bullet points and clear paragraphs for readability.
How to Use This:

When you commit your changes, instead of using the -m flag for a short message, simply run:

Bash

git commit

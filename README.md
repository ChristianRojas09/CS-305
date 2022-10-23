# CS-305

## Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

The client was Artemis Financial, they are a financial firm that helps their clients set up and manage their portfolios. The client requested our expertise in security to improve their application's security.

---

## What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

When I found vulnerabilities I was sure to include them in the reports and suggested fixes. This included manually reviewing the code and running dependency checks. Once all checks were done, I implemented a hash function to protect documentation, and creating an SSL certificate to provide safe communications between server and client.

---

## What part of the vulnerability assessment was challenging or helpful to you?

Creating the first checksum was a challenge. I did not understand how important directory location and naming convention was to SpringBoot and had trouble implementing the checksum. Once I gained a better understanding, I was able to generate the checks and certificate that I needed. I have no doubt this will provide useful in the future.

---

## How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I added an SHA-256 hash function to secure documentation, created an SSL certificate and forced HTTPS to create a safe client/server communication path, and used secure coding practices to reduce the possibility of data leakage.

---

## How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

I ensured the software was secure by checking against the dependency check, this way I could see which vulnerabilities still existed, if any.

---

## What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

SNHU provides a lot of great resources that helped me learn how to implement all of the necessary checks. I do plan on utilizing these in the future.

---

## Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

Because of this assignment, I am able to showcase my ability to write secure code, and test for security vulnerabilities.
---



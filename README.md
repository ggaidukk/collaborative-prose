# Collaborative Prose 

## Components Used

This project uses two peer Sentence components published as GitHub packages:

1. **joha1na’s component**  
   - GroupId: `de.htw_berlin.fb4.examples`  
   - ArtifactId: `prose_library`  
   - Version: `1.0.0`  
   - Repository: https://maven.pkg.github.com/joha1na/my-prose-app  
   - GitHub Repo: https://github.com/joha1na/my-prose-app

2. **sha-ma-ni’s component**  
   - GroupId: `de.htw_berlin.fb4.proseapp_Shamanina`  
   - ArtifactId: `prose-app`  
   - Version: `1.0-SNAPSHOT`  
   - Repository: https://maven.pkg.github.com/sha-ma-ni/prose-app-deploy  
   - GitHub Repo: https://github.com/sha-ma-ni/prose-app-deploy

3. **ProseBuilder library**  
   - GroupId: `de.htw_berlin.fb4.ossd`  
   - ArtifactId: `prose_builder`  
   - Version: `1.0-SNAPSHOT`  
   - Repository: https://maven.pkg.github.com/bs-jokri/prose-builder  
   - GitHub Repo: https://github.com/bs-jokri/prose-builder

---

## Maven Configuration

To use these components, the following repositories were added to the `pom.xml`:

```xml
<repositories>
    <repository>
        <id>joha1na</id>
        <url>https://maven.pkg.github.com/joha1na/my-prose-app</url>
    </repository>
    <repository>
        <id>shamani</id>
        <url>https://maven.pkg.github.com/sha-ma-ni/prose-app-deploy</url>
    </repository>
    <repository>
        <id>prose-builder</id>
        <url>https://maven.pkg.github.com/bs-jokri/prose-builder</url>
    </repository>
</repositories>
```
And these dependencies were added:

```xml
<dependencies>
    <dependency>
      <groupId>de.htw_berlin.fb4.examples</groupId>
      <artifactId>prose_library</artifactId>
      <version>1.0.0</version>
    </dependency>

    <dependency>
      <groupId>de.htw_berlin.fb4.proseapp_Shamanina</groupId>
      <artifactId>prose-app</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>

    <dependency>
      <groupId>de.htw_berlin.fb4.ossd</groupId>
      <artifactId>prose_builder</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>
  </dependencies>
```
---

## Example Output

Composed Prose:  
Hallo, das ist ein einfacher Satz.   
Dies ist ein Satz von sha-ma-ni.

---

## GitHub Issue Created

I created an issue in sha-ma-ni’s repository:  
https://github.com/sha-ma-ni/prose-app-deploy/issues/2#issue-3185637496

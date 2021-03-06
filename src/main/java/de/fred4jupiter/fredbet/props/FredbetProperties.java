package de.fred4jupiter.fredbet.props;

import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Contains all configuration properties for FredBet application.
 * 
 * @author michael
 *
 */
@ConfigurationProperties(prefix = FredbetProperties.PROPS_PREFIX)
public class FredbetProperties {

	public static final String PROPS_PREFIX = "fredbet";

	/**
	 * Image size of the generated thumbnails.
	 */
	private int thumbnailSize;

	/**
	 * Image size for the uploaded images.
	 */
	private int imageSize;

	/**
	 * Selection of possible image storage locations.
	 */
	private ImageLocation imageLocation;

	/**
	 * Path in file system to store images in case of image location is set to
	 * 'file-system'
	 */
	private String imageFileSystemBaseFolder;

	/**
	 * The AWS S3 bucket name to use to store images in.
	 */
	private String awsS3bucketName;

	private String awsAccessKey;

	private String awsSecretKey;

	private String awsRegion;

	private String defaultLanguage;

	public int getThumbnailSize() {
		return thumbnailSize;
	}

	public void setThumbnailSize(int thumbnailSize) {
		this.thumbnailSize = thumbnailSize;
	}

	public int getImageSize() {
		return imageSize;
	}

	public void setImageSize(int imageSize) {
		this.imageSize = imageSize;
	}

	public ImageLocation getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(ImageLocation imageLocation) {
		this.imageLocation = imageLocation;
	}

	public String getAwsS3bucketName() {
		return awsS3bucketName;
	}

	public void setAwsS3bucketName(String awsS3bucketName) {
		this.awsS3bucketName = awsS3bucketName;
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
		builder.append("thumbnailSize", thumbnailSize);
		builder.append("imageSize", imageSize);
		builder.append("imageLocation", imageLocation);

		builder.append("imageFileSystemBaseFolder", imageFileSystemBaseFolder);
		builder.append("awsS3bucketName", awsS3bucketName);
		return builder.toString();
	}

	public String getImageFileSystemBaseFolder() {
		return imageFileSystemBaseFolder;
	}

	public void setImageFileSystemBaseFolder(String imageFileSystemBaseFolder) {
		this.imageFileSystemBaseFolder = imageFileSystemBaseFolder;
	}

	public String getAwsAccessKey() {
		return awsAccessKey;
	}

	public void setAwsAccessKey(String awsAccessKey) {
		this.awsAccessKey = awsAccessKey;
	}

	public String getAwsSecretKey() {
		return awsSecretKey;
	}

	public void setAwsSecretKey(String awsSecretKey) {
		this.awsSecretKey = awsSecretKey;
	}

	public String getAwsRegion() {
		return awsRegion;
	}

	public void setAwsRegion(String awsRegion) {
		this.awsRegion = awsRegion;
	}

	public Locale getDefaultLocale() {
		if (StringUtils.isBlank(defaultLanguage)) {
			return Locale.GERMAN;
		}

		return new Locale(defaultLanguage);
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
}

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@60db1c0e;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27926
 */
public class MANSX200MLC70TrackWayMattingSystem extends EntityType
{
    /** Default constructor */
    public MANSX200MLC70TrackWayMattingSystem()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 16306, Engineer Equipment
        setSubCategory((byte)4); // uid 27926, MAN SX200 MLC-70 Track Way Matting System
    }
}

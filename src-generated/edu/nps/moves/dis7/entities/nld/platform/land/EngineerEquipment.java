package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@52350abb;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27954
 */
public class EngineerEquipment extends EntityType
{
    /** Default constructor */
    public EngineerEquipment()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 27954, Engineer Equipment
    }
}

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1ddae9b5
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24878
 */
public class ToyotaSequoiawRoofMountedPKMG extends EntityType
{
    public ToyotaSequoiawRoofMountedPKMG()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24863, Car
        setSubCategory((byte)114); // uid 24876, Sports Utility Vehicle (SUV), Full/Premium/Luxury (Large)
        setSpecific((byte)1); // uid 24877, Toyota Sequoia
        setExtra((byte)1); // uid 24878, Toyota Sequoia w/ Roof-Mounted PK MG
    }
}

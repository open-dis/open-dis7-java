package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34a1d21f
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24865
 */
public class ToyotaTercel extends EntityType
{
    public ToyotaTercel()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24863, Car
        setSubCategory((byte)42); // uid 24864, 4-Door Sedan, Economy/Compact (Small)
        setSpecific((byte)1); // uid 24865, Toyota Tercel
    }
}

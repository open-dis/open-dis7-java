package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@71ae31b0
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24866
 */
public class _4DoorSedanIntermediateStandardMedium extends EntityType
{
    public _4DoorSedanIntermediateStandardMedium()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24863, Car
        setSubCategory((byte)43); // uid 24866, 4-Door Sedan, Intermediate/Standard (Medium)
    }
}

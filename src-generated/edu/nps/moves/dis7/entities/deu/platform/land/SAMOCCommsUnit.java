package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62656be4;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28050
 */
public class SAMOCCommsUnit extends EntityType
{
    /** Default constructor */
    public SAMOCCommsUnit()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)38); // uid 28047, Missile Defense Facility
        setSubCategory((byte)2); // uid 28048, SAMOC
        setSpecific((byte)2); // uid 28050, SAMOC Comms-Unit
    }
}

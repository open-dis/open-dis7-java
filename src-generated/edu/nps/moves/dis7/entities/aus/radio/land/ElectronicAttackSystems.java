package edu.nps.moves.dis7.entities.aus.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@7c9372ed;
 * Country: Australia (AUS);
 * Entity kind: Radio;
 * Domain: LAND;
 *
 * Entity type uid: 31616
 */
public class ElectronicAttackSystems extends EntityType
{
    /** Default constructor */
    public ElectronicAttackSystems()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31616, Electronic Attack Systems
    }
}

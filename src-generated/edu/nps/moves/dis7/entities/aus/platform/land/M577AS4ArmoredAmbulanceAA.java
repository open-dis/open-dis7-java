package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@aec6354;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28619
 */
public class M577AS4ArmoredAmbulanceAA extends EntityType
{
    /** Default constructor */
    public M577AS4ArmoredAmbulanceAA()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)3); // uid 28618, M577-AS4 Armored Command Vehicle (ACC)
        setSpecific((byte)1); // uid 28619, M577A-S4 Armored Ambulance (AA)
    }
}
